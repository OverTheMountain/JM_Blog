package com.blog.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/8 16:53
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**") //拦截admin下所有方法
                .excludePathPatterns("/admin")  //排除admin
                .excludePathPatterns("/admin/login");   //排除admin/login
    }
}
