package com.tang.config;

import com.tang.component.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: create by shujuan.tang
 * @description: src.main.java.com.tang.config
 * @date:2021/2/4 If you want to keep Spring Boot MVC features
 **/

/**
 * 所有继承WebMvcConfigurer
 * 都会作为mvc配置读入容器中
 * 以下为类和函数实现添加自定义配置的两种方法
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    //配置默认访问路由（继承接口方式
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }
    //通过函数实现自定义mvc配置
//    @Bean
//    public  WebMvcConfigurer mvcConfigurer(){
//        return  new WebMvcConfigurer() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/login.html").setViewName("index");
//
//            }
//        };
//}


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login.html", "/", "/login");
    }
}
