package narcisah.wp_pr1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       
       
       Vehicle c1= (Vehicle) context.getBean("car");
       c1.drive();
       
      /* Tire t1 = (Tire) context.getBean("tire");
       System.out.println(t1);;*/
    }
}
