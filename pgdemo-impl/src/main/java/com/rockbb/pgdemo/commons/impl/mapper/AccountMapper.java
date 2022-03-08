package com.rockbb.pgdemo.commons.impl.mapper;

import com.rockbb.pgdemo.commons.api.dto.AccountDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("accountMapper")
public interface AccountMapper {
    String[] ORDERBY = {"id"};

    int insert(AccountDTO dto);

    int delete(@Param("id") long id);

    int update(AccountDTO dto);

    AccountDTO select(@Param("id") long id);

    List<AccountDTO> list(
            @Param("param") Map<String, Object> args);

    long count(@Param("param") Map<String, Object> args);

}
