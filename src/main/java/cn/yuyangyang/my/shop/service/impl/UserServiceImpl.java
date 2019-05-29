package cn.yuyangyang.my.shop.service.impl;

import cn.yuyangyang.my.shop.commons.context.SpringContext;
import cn.yuyangyang.my.shop.dao.UserDao;
import cn.yuyangyang.my.shop.entity.User;
import cn.yuyangyang.my.shop.service.UserService;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
public class UserServiceImpl implements UserService {


    public User login(String email, String password) {
        UserDao userDao = (UserDao) new SpringContext().getBean("userDao");
        return userDao.getUserByEmailAndPassword(email,password);
    }
}
