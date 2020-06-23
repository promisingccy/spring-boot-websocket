package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName AuthResponse
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:00
 * @Version 1.0
 **/
@Getter
@Setter
public class AuthResponse implements Message {
    public static final String TYPE = "AUTH_RESPONSE";

    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应提示
     */
    private String message;

}
