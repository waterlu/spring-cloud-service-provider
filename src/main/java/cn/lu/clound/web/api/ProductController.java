package cn.lu.clound.web.api;

import cn.lu.clound.common.ResponseResult;
import cn.lu.clound.data.ProductData;
import cn.lu.clound.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductData productData;

    @GetMapping("/{productUUid}")
    public ResponseResult getProduct(@PathVariable String productUUid) {
        ResponseResult responseResult = new ResponseResult();
        Product product = productData.get(productUUid);
        responseResult.setData(product);
        return responseResult;
    }

    @GetMapping("/")
    public ResponseResult getProductList() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.getAll());
        return responseResult;
    }

}