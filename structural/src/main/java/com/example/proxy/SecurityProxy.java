package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

	private Object obj;
	public SecurityProxy(Object obj) {
		this.obj = obj;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), 
				new SecurityProxy(obj));
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		try {
			if(method.getName().equals("getTimeline")) {
				throw new IllegalAccessException("Twitter not allow v1 anymore");
			} else {
				result = method.invoke(obj, args);							
			}
		} catch(InvocationTargetException ex) {
			throw ex.getTargetException();
		} catch(Exception ex) {
			throw new RuntimeException("Unexpected invocation exception" + ex.getMessage());
		}
		return result;
	}

}
