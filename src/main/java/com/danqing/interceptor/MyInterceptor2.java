package com.danqing.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 丹青
 * @date 2019/10/3-16:10
 */


public class MyInterceptor2 implements HandlerInterceptor {
    /**
     * 预处理，controller方法执行前（用于逻辑判断，必然登录没登录）
     * return true 放行，执行下一个拦截器，如果没有执行controller中的方法
     * return false 不放行
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("Myinterceptor执行了……前222");
        //调整页面
        //httpServletRequest.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(httpServletRequest, httpServletResponse);
        return true;
//        return false;
    }

    /**
     * 后处理方法，controller方法执行后，success.jsp执行前
     *以为在success.jsp执行前，所以也可以用来跳转页面
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("Myintercertor执行了……后222");
    }

    /**success.jsp方法执行后执行（最后释放资源）
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("Myinterceptor方法执行……最后222");
    }
}
