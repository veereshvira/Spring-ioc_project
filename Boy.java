package annotation_icecream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
	@Qualifier("strawberry")
	@Autowired
	IceCream iceCream;
	
	void eat() {
		System.out.println("Boy is eating IcreCream....");
		iceCream.open();
	}
}
