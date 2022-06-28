package org.springframework.mycode;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈〉
 *
 * @author ljx
 * @version 1.0.0
 * @create 2022/6/23 10:49
 */

public class XmlTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myXml.xml");
		A bean = context.getBean(A.class);
		System.out.println(bean.getName());
	}
}