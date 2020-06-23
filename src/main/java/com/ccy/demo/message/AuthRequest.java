package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName AuthRequest
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 11:58
 * @Version 1.0
 **/
@Setter
@Getter
public class AuthRequest implements Message {
    public static final String TYPE = "AUTH_REQUEST";

    /**
     * 认证 Token
     */
    private String accessToken;
}
