package com.adrian.master.backendUserConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.adrian.master"})
public class BackendUserConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendUserConfigurationApplication.class, args);
	}

}
