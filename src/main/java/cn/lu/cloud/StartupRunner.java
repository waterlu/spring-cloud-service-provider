package cn.lu.cloud;

import cn.lu.cloud.data.ProductData;
import cn.lu.cloud.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

/**
 * Created by lutiehua on 2017/10/10.
 */
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private ProductData productData;

    @Override
    public void run(String... strings) throws Exception {

        ProductDTO product1 = new ProductDTO();
        product1.setProductUuid("6469b9e9d4f742ca979ae5bb65e440f8");
        product1.setProductName("默认理财产品1号");
        product1.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product1.setProductScale(new BigDecimal(10000000));
        product1.setProductMinInvestment(new BigDecimal(10));
        product1.setProductMaxInvestment(new BigDecimal(10000));
        productData.add(product1);

        ProductDTO product2 = new ProductDTO();
        product2.setProductUuid("6a5e31eca0f5499dbb9fb945dd1101f8");
        product2.setProductName("默认理财产品2号");
        product2.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product2.setProductScale(new BigDecimal(100000));
        productData.add(product2);

        ProductDTO product3 = new ProductDTO();
        product3.setProductUuid("54410325492c48bb9ffee92d59e89066");
        product3.setProductName("默认理财产品3号");
        product3.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product3.setProductScale(new BigDecimal(100000));
        productData.add(product3);
    }
}