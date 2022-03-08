package com.rockbb.pgdemo.commons.test;

import com.rockbb.pgdemo.commons.api.dto.AccountDTO;
import com.rockbb.pgdemo.commons.impl.mapper.AccountMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AccountTest {
    @Resource
    AccountMapper accountMapper;

    @Test
    void list() {
        System.out.println("hello");
        List<AccountDTO> accounts = accountMapper.list(new HashMap<>());
        System.out.println(accounts.size());
    }

    @Test
    void insert() {
        AccountDTO account = new AccountDTO();
        account.setName("test");
        account.setVal(10);
        account.setAmount(new BigDecimal("1003.51"));
        account.setFlag(true);
        account.setStatus(5);
        account.setCreatedAt(new Date());
        account.setVersion(1);
        Assertions.assertThat(accountMapper.insert(account)).isEqualTo(1);
        System.out.println(account.getId());
        AccountDTO dummy = accountMapper.select(account.getId());
        Assertions.assertThat(dummy).isNotNull();
        System.out.println(dummy.getName());
        Assertions.assertThat(accountMapper.delete(account.getId())).isEqualTo(1);
        System.out.println("deleted");
    }
}
