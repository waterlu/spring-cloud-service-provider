package cn.lu.cloud.web.mgt;

import cn.lu.cloud.api.ProductMgtAPI;
import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.data.ProductData;
import cn.lu.cloud.dto.ProductDTO;
import cn.lu.cloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
public class ProductMgtController implements ProductMgtAPI {

    @Autowired
    private ProductData productData;

    @Override
    public ResponseResult createProduct(ProductDTO productDTO) {
        ResponseResult responseResult = new ResponseResult();
//        Product product = new Product(productDTO);
//        responseResult.setData(productData.add(product));
        return responseResult;
    }

    @Override
    public ResponseResult updateProduct(String s, ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseResult deleteProduct(String s) {
        return null;
    }
}

//@RestController
//@RequestMapping("/mgt/products")
//public class ProductMgtController {
//
//    @Autowired
//    private ProductData productData;
//
//    @PostMapping("/")
//    public ResponseResult createProduct(@RequestBody Product product) {
//        ResponseResult responseResult = new ResponseResult();
//        responseResult.setData(productData.add(product));
//        return responseResult;
//    }
//
//    @PutMapping("/{productUUid}")
//    public ResponseResult updateProduct(@PathVariable String productUUid, @RequestBody Product product) {
//        ResponseResult responseResult = new ResponseResult();
//        responseResult.setData(productData.put(productUUid, product));
//        return responseResult;
//    }
//
//    @DeleteMapping("/{productUUid}")
//    public ResponseResult deleteProduct(@PathVariable String productUUid) {
//        ResponseResult responseResult = new ResponseResult();
//        responseResult.setData(productData.remove(productUUid));
//        return responseResult;
//    }
//
//}