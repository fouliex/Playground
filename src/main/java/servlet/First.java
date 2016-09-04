package servlet;

import java.io.*;
import javax.servlet.*;

/**
 * Created by 212361198 on 8/19/16.
 */
public class First implements Servlet {

    ServletConfig config = null;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.print("servlet is initialized");


    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       servletResponse.setContentType("text/html");

        PrintWriter out  = servletResponse.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }



    @Override
    public String getServletInfo() {
        return "copyright 2007-1010";
    }

    @Override
    public void destroy() {
        System.out.println("servlet is destroyed");
    }


}
