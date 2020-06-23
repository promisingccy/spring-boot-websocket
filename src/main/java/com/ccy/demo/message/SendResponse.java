package com.ccy.demo.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName SendResponse
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:05
 * @Version 1.0
 * 在服务端接收到发送消息的请求，需要异步响应发送是否成功。
 **/
@Getter
@Setter
public class SendResponse implements Message {
    public static final String TYPE = "SEND_RESPONSE";

    /**
     * 消息编号
     */
    private String msgId;
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应提示
     */
    private String message;

}
