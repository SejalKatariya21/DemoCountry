package sejal.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


//@ComponentScan(basePackageClasses = CountryController.class)
public class CountryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class,args);
    }
}