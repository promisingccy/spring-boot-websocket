package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SendToAllRequest
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:05
 * @Version 1.0
 **/
@Setter
@Getter
public class SendToAllRequest implements Message {
    public static final String TYPE = "SEND_TO_ALL_REQUEST";

    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 内容
     */
    private String content;

}
