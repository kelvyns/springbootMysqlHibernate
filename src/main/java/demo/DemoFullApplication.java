package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "demo")
@EntityScan(basePackages = "demo")
public class DemoFullApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFullApplication.class, args);
    }
}
