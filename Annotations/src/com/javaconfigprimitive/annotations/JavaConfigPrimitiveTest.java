package com.javaconfigprimitive.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigPrimitiveTest {
 public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
System.out.println(context.getBean("radio",Radio.class));
 }
}
