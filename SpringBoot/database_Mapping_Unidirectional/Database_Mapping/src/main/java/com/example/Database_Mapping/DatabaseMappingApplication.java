package com.example.Database_Mapping;

import com.example.Database_Mapping.service.AddressServiceImpl;
import com.example.Database_Mapping.service.StudentServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseMappingApplication  implements CommandLineRunner {


	private StudentServiceImpl studentserviceImpl;
	private AddressServiceImpl addressServiceImpl;


	public static void main(String[] args) {
		SpringApplication.run(DatabaseMappingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
