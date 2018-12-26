package com.ntl.Spring.ntl_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ntl.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    /*   AbstractApplicationContext ctx;
       ctx=new ClassPathXmlApplicationContext("Employee.xml");
       
      
       Employee emp=ctx.getBean("empLarge",Employee.class);
     //  Employee empNew=ctx.getBean("emp1",Employee.class); 
    
       
       ctx.registerShutdownHook();			//just registering the event and will call function destroy when the scope is closing
       
       System.out.println(emp);
       emp.display();

       
       */
       // ASPECT----AOP-----------------------------------------------------------------
       
       ApplicationContext context = new ClassPathXmlApplicationContext("Advisor.xml");
       
       Employee empt = (Employee) context.getBean("empy");
       empt.toString();
       empt.display();
      //empt.printThrowException();
       
       
       
    }
}
