package com.gt.examplespringbootprovider;

import com.gt.example.common.model.User;
import com.gt.example.common.service.UserService;
import com.gt.newrpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author  gt
 *      
 *   
 */
@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
