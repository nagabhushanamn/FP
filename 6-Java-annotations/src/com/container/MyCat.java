package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyCat {

	public void processReq(String httpRequest) {

		try {

			Class<?> clazz = Class.forName("com.component.UserController");
			Object userController = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					String url = rm.url();
					if (httpRequest.equals(url)) {
						method.invoke(userController, new Object[] {});
						return;
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
