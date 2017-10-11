package cn.lu.cloud.web.api;

import cn.lu.cloud.api.ProductAPI;
import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.data.ProductData;
import cn.lu.cloud.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
public class ProductController implements ProductAPI {

    @Autowired
    private ProductData productData;

    @Override
    public ResponseResult getProduct(@PathVariable String productUuid) {
        ResponseResult responseResult = new ResponseResult();
        ProductDTO product = productData.get(productUuid);
        responseResult.setData(product);
        return responseResult;
    }

    @Override
    public ResponseResult getProductList() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.getAll());
        return responseResult;
    }
}