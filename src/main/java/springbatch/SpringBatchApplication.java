package springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		System.out.println("args[0] = " + args[0] + ", args[1] = " +args[1]);
		SpringApplication.run(SpringBatchApplication.class, args);
	}

}
