package cn.yuyangyang.my.shop.dao;

import cn.yuyangyang.my.shop.entity.User;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
public interface UserDao {
    /**
     * 通过 email和password获取一个用户信息
     * @param email
     * @param password
     * @return 用户
     */
    public User getUserByEmailAndPassword(String email, String password);
}
