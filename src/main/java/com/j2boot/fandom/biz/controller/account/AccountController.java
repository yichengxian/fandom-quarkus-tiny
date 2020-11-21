package com.j2boot.fandom.biz.controller.account;


import com.j2boot.fandom.biz.service.account.AccountService;
import com.j2boot.fandom.biz.vo.token.LoginVo;
import com.j2boot.fandom.biz.vo.token.TokenVo;
import com.j2boot.fandom.common.result.CommonResult;
import org.apiguardian.api.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 账户
 * @author yichengxian
 */
@RestController
@RequestMapping(value = "account")
public class AccountController {

    //public CommonResult<String> reg


    @Autowired
    private AccountService accountService;
    /**
     * 登录
     * @return
     */
    @PostMapping(path = "login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonResult<TokenVo> login(@Valid @RequestBody LoginVo loginVo){
        return accountService.login(loginVo.getAccountName(),loginVo.getPassword());
    }


}
