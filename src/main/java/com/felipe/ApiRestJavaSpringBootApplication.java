package com.felipe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipe.model.CountDuplicatesModel;

@SpringBootApplication
public class ApiRestJavaSpringBootApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(ApiRestJavaSpringBootApplication.class);
	
	@Autowired
	private CountDuplicatesModel countDuplicatesModel;
	
	@Override
	public void run(String... args) throws Exception {
		log.info(countDuplicatesModel.firstAlgorithm("a")+"");
		log.info(countDuplicatesModel.firstAlgorithm("ab")+"");
		log.info(countDuplicatesModel.firstAlgorithm("abcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aabbcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aabBcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("indivisibility")+"");
		log.info(countDuplicatesModel.firstAlgorithm("Indivisibilities")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aA11")+"");
		log.info(countDuplicatesModel.firstAlgorithm("ABBA")+"");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestJavaSpringBootApplication.class, args);
	}
}
