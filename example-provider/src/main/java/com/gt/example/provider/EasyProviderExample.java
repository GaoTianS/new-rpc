package com.gt.example.provider;

import com.gt.example.common.service.UserService;
import com.gt.newrpc.registry.LocalRegistry;
import com.gt.newrpc.server.HttpServer;
import com.gt.newrpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 *
 * @author  gt
 *      
 *   
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务 监听8080端口
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
