package narcisah.wp_pr1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle 
{
	@Autowired
	private Tire t;
	
	public void drive() {
		System.out.println("Drive the car " + t);
	}

}
