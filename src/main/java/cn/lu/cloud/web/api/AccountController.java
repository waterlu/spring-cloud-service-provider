package cn.lu.cloud.web.api;

import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.domain.Account;
import cn.lu.cloud.dto.UpdateAccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by lutiehua on 2017/10/25.
 */
@RestController
@RequestMapping({"/api/accounts"})
public class AccountController {

    private final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @PutMapping({"/balance"})
    public ResponseResult updateBalance(@RequestBody UpdateAccountDTO updateAccountDTO) {
        logger.info("{} change balance {}", updateAccountDTO.getAccountUuid(), updateAccountDTO.getBalanceChanged());

        ResponseResult responseResult = new ResponseResult();
        Account account = new Account();
        account.setAccountUuid(updateAccountDTO.getAccountUuid());
        account.setBalance(new BigDecimal(10000));
        responseResult.setData(account);
        return responseResult;
    }
}