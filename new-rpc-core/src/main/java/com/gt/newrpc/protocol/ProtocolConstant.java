package com.gt.newrpc.protocol;

/**
 * 协议常量
 *
 * @author  gt
 * @from <a href="https://yupi.icu">编程导航学习圈</a>
 *     <a href="https://codefather.cn">鱼皮的编程宝典</a>
 */
public interface ProtocolConstant {

    /**
     * 消息头长度
     */
    int MESSAGE_HEADER_LENGTH = 17;

    /**
     * 协议魔数
     */
    byte PROTOCOL_MAGIC = 0x1;

    /**
     * 协议版本号
     */
    byte PROTOCOL_VERSION = 0x1;
}
