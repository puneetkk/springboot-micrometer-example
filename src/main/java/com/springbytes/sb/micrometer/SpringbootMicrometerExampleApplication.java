package com.springbytes.sb.micrometer;

import com.springbytes.sb.micrometer.model.Customer;
import com.springbytes.sb.micrometer.repo.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootMicrometerExampleApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringbootMicrometerExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicrometerExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner setupDB(CustomerRepository repository){

		return (args) -> {
			//repository.save(new Customer("Puneet", "Kankane"));
			//repository.save(new Customer("John", "Doe"));

			log.info("List of Customers:");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

		};

	}

}
