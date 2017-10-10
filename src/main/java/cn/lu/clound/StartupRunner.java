package cn.lu.clound;

import cn.lu.clound.data.ProductData;
import cn.lu.clound.entity.Product;
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

        Product product1 = new Product();
        product1.setProductUuid("6469b9e9d4f742ca979ae5bb65e440f8");
        product1.setProductName("默认理财产品1号");
        product1.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product1.setProductScale(new BigDecimal(100000));
        productData.add(product1);

        Product product2 = new Product();
        product2.setProductUuid("6a5e31eca0f5499dbb9fb945dd1101f8");
        product2.setProductName("默认理财产品2号");
        product2.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product2.setProductScale(new BigDecimal(100000));
        productData.add(product2);

        Product product3 = new Product();
        product3.setProductUuid("54410325492c48bb9ffee92d59e89066");
        product3.setProductName("默认理财产品3号");
        product3.setProductAnnualInterestRate(new BigDecimal(0.08d));
        product3.setProductScale(new BigDecimal(100000));
        productData.add(product3);
    }
}