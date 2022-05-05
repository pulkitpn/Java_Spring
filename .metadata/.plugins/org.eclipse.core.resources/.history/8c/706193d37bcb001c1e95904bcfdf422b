package com.genpact.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext con =  new ClassPathXmlApplicationContext("config.xml");
        
        HelloWorld obj = con.getBean(HelloWorld.class);
        obj.sayHello();
        
        Employee obj1 = con.getBean(Employee.class);
        System.out.println(obj1);
        
        con.close();
    }
}
