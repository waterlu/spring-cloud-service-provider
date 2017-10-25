package cn.lu.cloud.web.api;

import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.domain.User;
import cn.lu.cloud.dto.UserLoginDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RestController
@RequestMapping({"/api/users"})
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping({"/login"})
    public ResponseResult login(@RequestBody UserLoginDTO userLoginDTO) {
        logger.info("{} login with password {}", userLoginDTO.getUsername(), userLoginDTO.getPassword());

        ResponseResult responseResult = new ResponseResult();
        User user = new User();
        user.setUsername(userLoginDTO.getUsername());
        user.setUserUuid("c09fc0edf153421cb7834d7c43efcf0d");
        user.setAccountUuid("4ca77f4d8a2e4aa0ad276601563b6198");
        responseResult.setData(user);
        return responseResult;
    }
}