package com.crunchify.controller;
 
import org.springframework.context.ApplicationContext;
 
/*
 * author: Crunchify.com
 * 
 */
 
public class CrunchifyLoadAllLoadedSpringMVCBean {
 
	public void crunchifyLogSpringBeans(ApplicationContext ctx) {
		String[] crunchifyBeans = ctx.getBeanDefinitionNames();
		int loadedTotalBeans = ctx.getBeanDefinitionCount();
 
		String crunchifyFormat = getCrunchifyFormat(crunchifyBeans);
 
		printStatement(String.format("------------- Total Loaded Spring Beans: %d ------------- \n", loadedTotalBeans));
 
		int count = 1;
		for (String crunchifyBean : crunchifyBeans) {
			Class<?> beanType = ctx.getType(crunchifyBean);
			Package beanPackage = beanType.getPackage();
			printStatement(String.format(crunchifyFormat, count++, crunchifyBean, beanType.getName(), beanPackage));
		}
	}
 
	private static void printStatement(String value) {
		System.out.println(value);
	}
 
	private static String getCrunchifyFormat(String[] crunchifyBean) {
		int namespace = betterAlignment(crunchifyBean);
		int typespace = (crunchifyBean.length < 100) ? 2 : 3;
		return String.format("%%%dd: Crunchify Bean Name: %%-%ds \n - Bean Type: %%s \n - Package: %%s \n", typespace, namespace);
	}
 
	private static int betterAlignment(String[] crunchifyBean) {
		int length = 0;
 
		for (String crunchifyString : crunchifyBean) {
			if (crunchifyString.length() > length)
				length = crunchifyString.length();
		}
		return length;
	}
}