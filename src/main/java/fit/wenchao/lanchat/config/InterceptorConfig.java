package fit.wenchao.lanchat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fit.wenchao.lanchat.interceptor.ApiLogInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    ApplicationContext applicationContext;

    private <T> T getBeanFromIOC(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 日志拦截器
        registry.addInterceptor(getBeanFromIOC(ApiLogInterceptor.class)).addPathPatterns("**");

    }
}
