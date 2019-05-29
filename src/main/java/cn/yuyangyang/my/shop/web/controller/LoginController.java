package cn.yuyangyang.my.shop.web.controller;

import cn.yuyangyang.my.shop.commons.context.SpringContext;
import cn.yuyangyang.my.shop.entity.User;
import cn.yuyangyang.my.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserService userService = (UserService) new SpringContext().getBean("userService");
        User loginUser = userService.login(email, password);

        if (loginUser != null){
            // 登录成功
            resp.sendRedirect("/main.jsp");
        }else {
            // 登录失败
            req.setAttribute("msg","用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }
}
