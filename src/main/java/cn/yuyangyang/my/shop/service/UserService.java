package cn.yuyangyang.my.shop.service;

import cn.yuyangyang.my.shop.entity.User;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
public interface UserService {
    /**
     * login
     * @param email
     * @param password
     * @return
     */
    public User login(String email, String password);
}
