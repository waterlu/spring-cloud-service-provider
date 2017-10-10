package cn.lu.clound.data;

import cn.lu.clound.entity.Product;
import com.google.common.base.Strings;

import java.util.*;

/**
 * Created by lutiehua on 2017/10/10.
 */
public class ProductData {

    private static Map<String, Product> productMap = new HashMap<>();

    public static long getId() {
        return productMap.size() + 1;
    }

    public static Product add(Product product) {
        if (Strings.isNullOrEmpty(product.getProductUuid())) {
            return null;
        }

        if (productMap.containsKey(product.getProductUuid())) {
            return null;
        }

        return productMap.put(product.getProductUuid(), product);
    }

    public static Product get(String productUuid) {
        return productMap.get(productUuid);
    }

    public static List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        productList.addAll(productMap.values());
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getProductId().compareTo(product2.getProductId());
            }
        });
        return productList;
    }

    public static Product put(String productUuid, Product product) {
        if (Strings.isNullOrEmpty(productUuid)) {
            return null;
        }

        if (productMap.containsKey(productUuid)) {
            return null;
        }

        return productMap.put(productUuid, product);
    }

    public static boolean remove(String productUuid) {
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
