package cn.yuyangyang.my.shop.dao.impl;

import cn.yuyangyang.my.shop.dao.UserDao;
import cn.yuyangyang.my.shop.entity.User;
import cn.yuyangyang.my.shop.web.controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
public class UserDaoImpl implements UserDao {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        if("fish@1998.group".equals(email)){
            if ("123".equals(password)){
                return new User("admin","fish@1998.group","123");
            }
        }
        return user;
    }
}
