package narcisah.wp_pr1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("Ride the bike");
	}

}
