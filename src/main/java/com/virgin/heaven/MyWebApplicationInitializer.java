package com.virgin.heaven;

import com.virgin.heaven.servlet.InitLog4jServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        //加载spring配置
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringContextConfig.class);
        applicationContext.setServletContext(servletContext);
        applicationContext.refresh();
        //注册DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        //dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        //注册InitLog4jServlet
        InitLog4jServlet initLog4jServlet = new InitLog4jServlet();
        registration = servletContext.addServlet("initLog4jServlet", initLog4jServlet);
        registration.setInitParameter("log4j-init-file", "WEB-INF/classes/log4j.properties");
        registration.setLoadOnStartup(1);
    }
}
