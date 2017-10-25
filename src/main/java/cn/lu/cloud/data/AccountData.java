package cn.lu.cloud.data;

import cn.lu.cloud.domain.Account;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lutiehua on 2017/10/25.
 */
public class AccountData {

    private Map<String, Account> accountMap = new ConcurrentHashMap<>();


}
