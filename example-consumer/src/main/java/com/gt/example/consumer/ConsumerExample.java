package com.gt.example.consumer;

import com.gt.example.common.model.User;
import com.gt.example.common.service.UserService;
import com.gt.newrpc.bootstrap.ConsumerBootstrap;
import com.gt.newrpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 *
 * @author  gt
 *      
 *   
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
