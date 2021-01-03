package com.dev.ops;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.ops.test.CalculadoraTest;
import com.dev.ops.test.SaludarTests;

@SpringBootApplication
public class DevopsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Result result = JUnitCore.runClasses(SaludarTests.class, CalculadoraTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("Junit Error is: " + failure.toString());
		}
		System.out.println("junit tests are succesfull: " + result.wasSuccessful());
	}
}
