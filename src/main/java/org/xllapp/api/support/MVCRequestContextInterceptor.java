package org.xllapp.api.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ffcs.icity.mvc.support.RequestContextHolder;

/**
 * 
 * 
 * @author dylan.chen Mar 2, 2013
 * 
 */
public class MVCRequestContextInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		RequestContextHolder.setRequest(request);
		RequestContextHolder.setResponse(response);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		RequestContextHolder.clear();
	}
}