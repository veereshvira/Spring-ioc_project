package annotation_icecream;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ButterScotch implements IceCream {

	public void open() {
		System.out.println("Boy is eating ButterScotch icecream..");
		
	}
	
}
