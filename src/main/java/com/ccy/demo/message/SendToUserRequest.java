package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SendToUserRequest
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:06
 * @Version 1.0
 **/
@Getter
@Setter
public class SendToUserRequest implements Message {
    public static final String TYPE = "SEND_TO_USER_REQUEST";

    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 内容
     */
    private String content;

}
