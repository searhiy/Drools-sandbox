package drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by serhii on 30.11.14.
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}