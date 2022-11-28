package annotation_icecream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigIceCream.class);
		Boy boy = (Boy) context.getBean("boy");
		boy.eat();
	}
}
