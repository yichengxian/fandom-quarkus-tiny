package com.j2boot.fandom.biz.service.account.impl;

import com.j2boot.fandom.biz.dao.account.AccountEntity;
import com.j2boot.fandom.biz.service.account.AccountService;
import com.j2boot.fandom.biz.vo.token.TokenVo;
import com.j2boot.fandom.common.exception.BaseException;
import com.j2boot.fandom.common.result.CommonResult;
import org.springframework.stereotype.Service;

/**
 * 账户
 */
@Service
public class AccountServiceImpl implements AccountService {

    /**
     * 登录
     *
     * @param accountName 账户名
     * @param password 密码
     * @return
     */
    @Override
    public CommonResult<TokenVo> login(String accountName, String password) {

        AccountEntity accountEntity =  AccountEntity.find("accountName",accountName).firstResult();

        if (null == accountEntity){
            throw new BaseException("用户不存在");
        }

        return null;
    }
}
