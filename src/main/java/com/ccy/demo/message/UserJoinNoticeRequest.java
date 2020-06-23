package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName UserJoinNoticeRequest
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:03
 * @Version 1.0
 **/
@Getter
@Setter
public class UserJoinNoticeRequest implements Message {
    public static final String TYPE = "USER_JOIN_NOTICE_REQUEST";

    /**
     * 昵称
     */
    private String nickname;
}
