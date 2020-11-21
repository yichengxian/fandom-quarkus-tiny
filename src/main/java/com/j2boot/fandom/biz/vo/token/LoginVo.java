package com.j2boot.fandom.biz.vo.token;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo {

    @NotBlank(message = "账户名不能为空")
   // @NotNull(message = "账户名不为null")
    private String accountName;

    @NotBlank(message = "密码不能为空")
   // @NotNull(message = "密码不为null")
    private String password;
}
