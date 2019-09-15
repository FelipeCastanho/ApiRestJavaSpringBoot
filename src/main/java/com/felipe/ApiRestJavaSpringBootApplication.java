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
		
		log.info(countDuplicatesModel.firstAlgorithm("abcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aabbcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aabBcde")+"");
		log.info(countDuplicatesModel.firstAlgorithm("indivisibility")+"");
		log.info(countDuplicatesModel.firstAlgorithm("Indivisibilities")+"");
		log.info(countDuplicatesModel.firstAlgorithm("aA11")+"");
		log.info(countDuplicatesModel.firstAlgorithm("ABBA")+"");
		log.info("-");
		log.info(countDuplicatesModel.secondAlgorithm("abcde")+"");
		log.info(countDuplicatesModel.secondAlgorithm("aabbcde")+"");
		log.info(countDuplicatesModel.secondAlgorithm("aabBcde")+"");
		log.info(countDuplicatesModel.secondAlgorithm("indivisibility")+"");
		log.info(countDuplicatesModel.secondAlgorithm("Indivisibilities")+"");
		log.info(countDuplicatesModel.secondAlgorithm("aA11")+"");
		log.info(countDuplicatesModel.secondAlgorithm("ABBA")+"");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestJavaSpringBootApplication.class, args);
	}
}
