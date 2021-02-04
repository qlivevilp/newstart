package com.tang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: create by shujuan.tang
 * @description: src.main.java.com.tang.config
 * @date:2021/2/4 If you want to keep Spring Boot MVC features
 * and you want to add additional MVC configuration
 * (interceptors, formatters, view controllers, and other features),
 * you can add your own @Configuration class of type WebMvcConfigurer
 * but without @EnableWebMvc.
 * If you wish to provide custom instances of RequestMappingHandlerMapping,
 * RequestMappingHandlerAdapter, or ExceptionHandlerExceptionResolver,
 * you can declare a WebMvcRegistrationsAdapter instance to provide such components.
 */

/**
 * If you want to keep Spring Boot MVC features
 * and you want to add additional MVC configuration
 * (interceptors, formatters, view controllers, and other features),
 * you can add your own @Configuration class of type WebMvcConfigurer
 * but without @EnableWebMvc.
 * If you wish to provide custom instances of RequestMappingHandlerMapping,
 * RequestMappingHandlerAdapter, or ExceptionHandlerExceptionResolver,
 * you can declare a WebMvcRegistrationsAdapter instance to provide such components.
 */

/**
 * 所有继承WebMvcConfigurer
 * 都会作为mvc配置读入容器中
 * 以下为类和函数实现添加自定义配置的两种方法
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    //配置默认访问首页（继承接口方式
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }
    //通过函数实现自定义mvc配置
//    @Bean
//    public  WebMvcConfigurer mvcConfigurer(){
//        return  new WebMvcConfigurer() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index.html").setViewName("index");
//
//            }
//        };
//}

}
