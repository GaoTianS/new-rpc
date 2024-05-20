package com.gt.example.provider;

import com.gt.example.common.model.User;
import com.gt.example.common.service.UserService;

/**
 * 用户服务实现类
 *
 * @author  gt
 *      
 *   
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
