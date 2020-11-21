package com.j2boot.fandom.biz.service.account;

import com.j2boot.fandom.biz.vo.token.TokenVo;
import com.j2boot.fandom.common.result.CommonResult;

/**
 * 账户
 */
public interface AccountService {

    /**
     * 登录
     * @param accountName 账户名
     * @param password 密码
     * @return
     */
    CommonResult<TokenVo> login(String accountName,String password);
}
