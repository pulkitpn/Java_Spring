package com.genpact.proj3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
    	
    	Company company = app.getBean(Company.class);
    	company.showEmployee();
    	app.close();
        System.out.println( "Hello World!" );
    }
}
