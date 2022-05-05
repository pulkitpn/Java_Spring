package com.genpact.proj2;

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
    	Manager m1 = app.getBean(Manager.class);
    	m1.doWork();
    	
    	Accountant a1 = app.getBean(Accountant.class);
    	a1.doWork();
    	app.close();
        System.out.println( "Hello World!" );
    }
}
