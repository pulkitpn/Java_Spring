package com.genpact.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("JdbcContext.xml");

            CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
            Customer customer = new Customer(1, "aaaaa",8);
            customerDAO.insert(customer);

            Customer customer1 = customerDAO.findByCustomerId(1);
            System.out.println(customer1);
 
    }
 
}