package cn.lu.clound;

import cn.lu.clound.data.ProductData;
import cn.lu.clound.entity.Product;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by lutiehua on 2017/10/10.
 */
public class StartupRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date now = new Date();
        String date = dateFormat.format(now);

        String type = "FIXI";
        String uuid = null;
        long id = 0l;

        Product product1 = new Product();
        uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        id = ProductData.getId();
        product1.setProductId(id);
        product1.setProductUuid(uuid);
        product1.setProductType(type);
        product1.setProductCode(String.format("%s%s%04d", type, date, id));
        product1.setProductName(String.format("普惠金融%d号", id));
        product1.setProductStatus(2);
        product1.setProductOnStatus(2);
        product1.setProductPeriod(28);
        product1.setProductPeriodType("DAY");
        product1.setProductAnnualInterestRate(new BigDecimal(0.08d).setScale(4, BigDecimal.ROUND_HALF_UP));
        product1.setProductScale(new BigDecimal(100000));
        product1.setProductAccumulation(new BigDecimal(0));
        product1.setProductMinInvestment(new BigDecimal(1000));
        product1.setProductMaxInvestment(new BigDecimal(5000));
        ProductData.add(product1);

        Product product2 = new Product();
        uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        id = ProductData.getId();
        product2.setProductId(id);
        product2.setProductUuid(uuid);
        product2.setProductType(type);
        product2.setProductCode(String.format("%s%s%04d", type, date, id));
        product2.setProductName(String.format("普惠金融%d号", id));
        product2.setProductStatus(2);
        product2.setProductOnStatus(2);
        product2.setProductPeriod(28);
        product2.setProductPeriodType("DAY");
        product2.setProductAnnualInterestRate(new BigDecimal(0.08d).setScale(4, BigDecimal.ROUND_HALF_UP));
        product2.setProductScale(new BigDecimal(100000));
        product2.setProductAccumulation(new BigDecimal(0));
        product2.setProductMinInvestment(new BigDecimal(1000));
        product2.setProductMaxInvestment(new BigDecimal(5000));
        ProductData.add(product2);

        Product product3 = new Product();
        uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        id = ProductData.getId();
        product3.setProductId(id);
        product3.setProductUuid(uuid);
        product3.setProductType(type);
        product3.setProductCode(String.format("%s%s%04d", type, date, id));
        product3.setProductName(String.format("普惠金融%d号", id));
        product3.setProductStatus(2);
        product3.setProductOnStatus(2);
        product3.setProductPeriod(28);
        product3.setProductPeriodType("DAY");
        product3.setProductAnnualInterestRate(new BigDecimal(0.08d).setScale(4, BigDecimal.ROUND_HALF_UP));
        product3.setProductScale(new BigDecimal(100000));
        product3.setProductAccumulation(new BigDecimal(0));
        product3.setProductMinInvestment(new BigDecimal(1000));
        product3.setProductMaxInvestment(new BigDecimal(5000));
        ProductData.add(product3);
    }
}