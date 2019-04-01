package com.virgin.heaven.servlet;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitLog4jServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        String webRootPath = getServletContext().getRealPath("/");
        String log4jInitFile = getInitParameter("log4j-init-file");
        PropertyConfigurator.configure(webRootPath + log4jInitFile);
    }
}
