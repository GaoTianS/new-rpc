package com.gt.newrpc.exception;

/**
 * 自定义异常类
 *
 * @author  gt
 *     <a href="https://codefather.cn">鱼皮的编程宝典</a>
 * @from <a href="https://yupi.icu">编程导航学习圈</a>
 */
public class RpcException extends RuntimeException {

    public RpcException(String message) {
        super(message);
    }

}
