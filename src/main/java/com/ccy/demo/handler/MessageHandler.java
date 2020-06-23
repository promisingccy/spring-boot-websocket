package com.ccy.demo.handler;

import com.ccy.demo.message.Message;
import org.springframework.web.socket.WebSocketSession;


/**
 * @ClassName MessageHandler
 * @Description //TODO
 * @Author ccy
 * @Date 2020/6/23 12:07
 * @Version 1.0
 **/
public interface MessageHandler<T extends Message> {

    /**
     * 执行处理消息
     *
     * @param session 会话
     * @param message 消息
     */
    void execute(WebSocketSession session, T message);

    /**
     * @return 消息类型，即每个 Message 实现类上的 TYPE 静态字段
     */
    String getType();

}
