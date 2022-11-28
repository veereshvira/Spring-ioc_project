package annotation_icecream;

import org.springframework.stereotype.Component;

@Component
public class Strawberry implements IceCream {

	public void open() {
		System.out.println("Boy is eating Strawberry icecream..");

	}

}
