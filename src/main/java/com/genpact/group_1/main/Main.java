package com.genpact.group_1.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.genpact.group_1.dao.AdminDao;
import com.genpact.group_1.daoimpl.AdminDaoImpl;
import com.genpact.group_1.model.OrderTable;
import com.genpact.group_1.model.Product;

public class Main {
	public static void main(String[] args) {
		
		//System.out.println("hello");
		
		
		//Customer cr=new Customer("abc","sd","ada@mail.com",54,"1234567890","adasd","mp","45214");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AdminDao daoImpl = context.getBean("AdmindaoImpl", AdminDaoImpl.class);
		
//		List<Product> lst = daoImpl.getAllProduct();
//		lst.forEach(System.out::println);
		
		List<OrderTable> product = daoImpl.getAllOrder();
		System.out.println(product);
		
	}

}

//<bean class="com.genpact.group_1.daoimpl.CustomerDaoImpl" name="CustomerdaoImpl">
//<property name="jdbcTemplate2" ref="jTemplate"></property>
//</bean>