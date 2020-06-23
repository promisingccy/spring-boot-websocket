package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SendToOneRequest
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:04
 * @Version 1.0
 **/
@Getter
@Setter
public class SendToOneRequest implements Message {
    public static final String TYPE = "SEND_TO_ONE_REQUEST";

    /**
     * 发送给的用户
     */
    private String toUser;
    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 内容
     */
    private String content;
}
