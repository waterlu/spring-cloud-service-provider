package cn.lu.cloud.domain;

import java.math.BigDecimal;

/**
 * Created by lutiehua on 2017/10/25.
 */
public class Account {

    private String userUuid;

    private String accountUuid;

    private BigDecimal balance;

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
