package com.alexbt.goodies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupCommandLineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("AT STARTUP");
	}
}
