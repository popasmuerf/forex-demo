package io.thirdplanet.forex.forexdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForexDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexDemoApplication.class, args);
		System.out.println("running in main():" + Thread.currentThread().getName());
	}

}

