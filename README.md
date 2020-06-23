### 交互示例

##### websocket在线测试地址
> http://www.easyswoole.com/wstool.html

#### 私聊示例
ws://127.0.0.1:8080/?accessToken=番茄

{
    type: "SEND_TO_ONE_REQUEST",
    body: {
        toUser: "aa",
        msgId: "eaef4a3c-35dd-46ee-b548-f9c4eb6396fe",
        content: "收到aa 我是番茄"
    }
}
***
ws://127.0.0.1:8080/?accessToken=aa

{
    type: "SEND_TO_ONE_REQUEST",
    body: {
        toUser: "番茄",
        msgId: "eaef4a3c-35dd-46ee-b548-f9c4eb6396fe",
        content: "番茄 我是aa"
    }
}
***

#### 群聊示例
ws://127.0.0.1:8080/?accessToken=cc

{
    type: "SEND_TO_ALL_REQUEST",
    body: {
        msgId: "838e97e1-6ae9-40f9-99c3-f7127ed64747",
        content: "嗨 大家好 我是新来的cc 请多关照"
    }
}
***
