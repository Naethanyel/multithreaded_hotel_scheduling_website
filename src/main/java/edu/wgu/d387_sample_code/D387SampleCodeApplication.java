package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.model.response.TimeResponse;
import edu.wgu.d387_sample_code.model.response.WelcomeResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Properties;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

@SpringBootApplication
public class D387SampleCodeApplication {
	static ExecutorService messageExecutor=newFixedThreadPool(5);
	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
		Properties properties=new Properties();
		messageExecutor.execute(()-> {
			try {
				WelcomeResponse.getWelcomeMessage(properties, "welcome_resources_en_US.properties");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		messageExecutor.execute(()-> {
			try {
				WelcomeResponse.getWelcomeMessage(properties, "welcome_resources_fr_CA.properties");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		TimeResponse.getTimeResponse();

	}

}
