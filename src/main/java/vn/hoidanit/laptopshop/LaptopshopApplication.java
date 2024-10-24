package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {
		
		// Container
		// ApplicationContext locnht = SpringApplication.run(LaptopshopApplication.class, args);
		// for (String s: locnht.getBeanDefinitionNames()) {
		// 	System.out.println(s);
		// }
		
		SpringApplication.run(LaptopshopApplication.class, args);
	}

}
