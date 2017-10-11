package cn.lu.cloud.data;

import cn.lu.cloud.dto.ProductDTO;
import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lutiehua on 2017/10/10.
 */
@Component
public class ProductData {

    private Map<String, ProductDTO> productMap = new HashMap<>();

    @Value("${product.default.status}")
    private Integer defaultStatus;

    @Value("${product.default.onStatus}")
    private Integer defaultOnStatus;

    @Value("${product.default.period}")
    private Integer defaultPeriod;

    @Value("${product.default.periodType}")
    private String defaultPeriodType;

    @Value("${product.default.minInvestment}")
    private BigDecimal defaultMinInvestment;

    @Value("${product.default.maxInvestment}")
    private BigDecimal defaultMaxInvestment;

    public long getId() {
        return productMap.size() + 1;
    }

    public ProductDTO add(ProductDTO product) {
        if (Strings.isNullOrEmpty(product.getProductUuid())) {
            String uuid = UUID.randomUUID().toString();
            uuid = uuid.replaceAll("-", "");
            product.setProductUuid(uuid);
        }

        if (productMap.containsKey(product.getProductUuid())) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date now = new Date();
        String date = dateFormat.format(now);

        if (null == product.getProductId()) {
            long id = getId();
            product.setProductId(id);
        }

        if (null == product.getProductCode()) {
            product.setProductCode(String.format("%s%s%04d", product.getProductType(), date, product.getProductId()));
        }

        if (null == product.getProductName()) {
            product.setProductName(String.format("理财产品%d号", product.getProductId()));
        }

        if (null == product.getProductStatus()) {
            product.setProductStatus(defaultStatus);
        }

        if (null == product.getProductOnStatus()) {
            product.setProductOnStatus(defaultOnStatus);
        }

        if (null == product.getProductPeriod()) {
            product.setProductPeriod(defaultPeriod);
        }

        if (null == product.getProductPeriodType()) {
            product.setProductPeriodType(defaultPeriodType);
        }

        if (null == product.getProductMinInvestment()) {
            product.setProductMinInvestment(defaultMinInvestment);
        }

        if (null == product.getProductMaxInvestment()) {
            product.setProductMaxInvestment(defaultMaxInvestment);
        }

        BigDecimal minInvestment = product.getProductMinInvestment();
        minInvestment = minInvestment.setScale(2, BigDecimal.ROUND_HALF_UP);
        product.setProductMinInvestment(minInvestment);

        BigDecimal maxInvestment = product.getProductMaxInvestment();
        maxInvestment = maxInvestment.setScale(2, BigDecimal.ROUND_HALF_UP);
        product.setProductMaxInvestment(maxInvestment);

        BigDecimal annualInterestRate = product.getProductAnnualInterestRate();
        annualInterestRate = annualInterestRate.setScale(4, BigDecimal.ROUND_HALF_UP);
        product.setProductAnnualInterestRate(annualInterestRate);

        BigDecimal accumulation = new BigDecimal(0);
        accumulation = accumulation.setScale(2, BigDecimal.ROUND_HALF_UP);
        product.setProductAccumulation(accumulation);

        BigDecimal scale = product.getProductScale();
        scale = scale.setScale(2, BigDecimal.ROUND_HALF_UP);
        product.setProductScale(scale);

        productMap.put(product.getProductUuid(), product);
        return product;
    }

    public ProductDTO get(String productUuid) {
        return productMap.get(productUuid);
    }

    public List<ProductDTO> getAll() {
        List<ProductDTO> productList = new ArrayList<>();
        productList.addAll(productMap.values());
        Collections.sort(productList, new Comparator<ProductDTO>() {
            @Override
            public int compare(ProductDTO product1, ProductDTO product2) {
                return product1.getProductId().compareTo(product2.getProductId());
            }
        });
        return productList;
    }

    public ProductDTO put(String productUuid, ProductDTO product) {
        if (Strings.isNullOrEmpty(productUuid)) {
            return null;
        }

        if (productMap.containsKey(productUuid)) {
            return null;
        }

        productMap.put(productUuid, product);
        return product;
    }

    public boolean remove(String productUuid) {
        if (Strings.isNullOrEmpty(productUuid)) {
            return false;
        }

        if (productMap.containsKey(productUuid)) {
            return false;
        }

        productMap.remove(productUuid);
        return true;
    }
}
