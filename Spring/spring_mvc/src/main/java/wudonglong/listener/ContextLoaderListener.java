package wudonglong.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wudonglong.service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {



//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        将Spring的应用上下文对象存储到ServletContext域中
//        ServletContext servletContext = sce.getServletContext();
//        servletContext.setAttribute("app",app);
//        System.out.println("Spring容器创建完毕");



        //读取web.xml中的全局参数(使用web.xml配置，解耦)
        ServletContext servletContext = sce.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);

        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("Spring容器创建完毕");


    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
