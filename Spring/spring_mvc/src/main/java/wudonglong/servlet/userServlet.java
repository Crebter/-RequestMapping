package wudonglong.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wudonglong.listener.WebApplicationContextUtils;
import wudonglong.service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        //只让Spring创建一次容器，将app放入application域中，要的时候就获取
//        ServletContext servletContext = request.getServletContext();
//        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");


        //优化:将创建app的方法抽取出来变成一个方法，以后修改application域里面的app名字容易
        ServletContext servletContext = request.getServletContext();
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = app.getBean(UserService.class);
        userService.sava();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
