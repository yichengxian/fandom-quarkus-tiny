package com.j2boot.fandom.biz.vo.account;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author yichengxian
 *
 */
@Data
public class AccountVo {

    private String nickName;

    /**
     * 头像
     */

    private String avatar;


    /**
     * 生日
     */
    private LocalDate birthDate;


    private LocalDate createTime;

    /**
     * 性别 女 0 男 1
     */

    private Integer gender;
}
