package cn.lu.clound.web.mgt;

import cn.lu.clound.common.ResponseResult;
import cn.lu.clound.data.ProductData;
import cn.lu.clound.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
@RequestMapping("/mgt/products")
public class ProductMgtController {

    @Autowired
    private ProductData productData;

    @PostMapping("/")
    public ResponseResult createProduct(@RequestBody Product product) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.add(product));
        return responseResult;
    }

    @PutMapping("/{productUUid}")
    public ResponseResult updateProduct(@PathVariable String productUUid, @RequestBody Product product) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.put(productUUid, product));
        return responseResult;
    }

    @DeleteMapping("/{productUUid}")
    public ResponseResult deleteProduct(@PathVariable String productUUid) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.remove(productUUid));
        return responseResult;
    }

}