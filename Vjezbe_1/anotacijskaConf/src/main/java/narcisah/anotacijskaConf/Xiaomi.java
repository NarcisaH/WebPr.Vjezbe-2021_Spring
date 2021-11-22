package narcisah.anotacijskaConf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Xiaomi {
	
	@Autowired
	@Qualifier("Snapdragon")
	MobileProcessor cpu;
	
	
	public void config() {
		System.out.println("Octa core, 8Gb RAM, 24Mpx camera");
		
		cpu.process();
	}

}
