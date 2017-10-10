package cn.lu.clound.web.api;

import cn.lu.clound.common.ResponseResult;
import cn.lu.clound.data.ProductData;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping("/{productUUid}")
    public ResponseResult getProduct(@PathVariable String productUUid) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(ProductData.get(productUUid));
        return responseResult;
    }

    @GetMapping("/")
    public ResponseResult getProductList() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(ProductData.getAll());
        return responseResult;
    }

}