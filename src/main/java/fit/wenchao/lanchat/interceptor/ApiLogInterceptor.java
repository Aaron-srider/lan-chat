package fit.wenchao.lanchat.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import fit.wenchao.lanchat.utils.IPUtils;

@Component
public class ApiLogInterceptor implements HandlerInterceptor {
    private static Logger log = LoggerFactory.getLogger(ApiLogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ipAddress = IPUtils.getIpAddr(request);
        log.debug("{} {} {}", request.getMethod(), request.getRequestURI(), ipAddress);
        return true;
    }
}