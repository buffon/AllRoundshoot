package com.chen.vip.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * User: harry.chen
 * Date: 14-1-22
 * Time: 上午10:10
 */
public class BusinessFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String value = servletRequest.getParameter("param");
        System.out.printf("=========" + value);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
