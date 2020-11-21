package com.j2boot.fandom.biz.vo.token;

import com.j2boot.fandom.biz.vo.account.AccountVo;
import lombok.Builder;
import lombok.Data;

/**
 * token vo
 */
@Data
@Builder
public class TokenVo {

    private String token;

    private AccountVo accountVo;
}
