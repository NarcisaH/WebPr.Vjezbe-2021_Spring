package narcisah.anotacijskaConf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Snapdragon")
public class Snapdragon implements MobileProcessor{
	
	public void process() {
		System.out.println("The best CPU");
	}

}
