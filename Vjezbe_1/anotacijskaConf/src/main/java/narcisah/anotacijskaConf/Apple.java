package narcisah.anotacijskaConf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Apple")
public class Apple implements MobileProcessor{
	
	public void process() {
		System.out.println("Second best");
	}

}
