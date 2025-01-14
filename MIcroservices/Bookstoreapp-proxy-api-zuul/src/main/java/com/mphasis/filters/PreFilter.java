package com.mphasis.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx =RequestContext.getCurrentContext();
		HttpServletRequest request= ctx.getRequest();
		
		System.out.println("-------------------------------");
		System.out.println("\n Request Method:" + request.getMethod()
		+ "Request URL" + request.getRequestURL().toString());
		System.out.println("-------------------------------");

		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
