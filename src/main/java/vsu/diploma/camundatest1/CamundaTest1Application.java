package vsu.diploma.camundatest1;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(CamundaTest1Application.class, args);
	}
}
