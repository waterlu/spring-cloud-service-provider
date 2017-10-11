package cn.lu.cloud.web.mgt;

import cn.lu.cloud.api.ProductMgtAPI;
import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.data.ProductData;
import cn.lu.cloud.dto.ProductDTO;
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
    public ResponseResult createProduct(@RequestBody ProductDTO productDTO) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.add(productDTO));
        return responseResult;
    }

    @Override
    public ResponseResult updateProduct(@PathVariable("productUuid") String productUuid, @RequestBody ProductDTO productDTO) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.put(productUuid, productDTO));
        return responseResult;
    }

    @Override
    public ResponseResult deleteProduct(@PathVariable("productUuid") String productUuid) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(productData.remove(productUuid));
        return responseResult;
    }
}