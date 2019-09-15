package com.felipe.model;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.felipe.ApiRestJavaSpringBootApplication;

@Service
public class CountDuplicatesModel {
	private static Logger log = LoggerFactory.getLogger(ApiRestJavaSpringBootApplication.class);
	
	//Esta funcion convierte los caracteres del string a minusculas, luego los guarda en un arreglo que pasa por la 
	//funcion sort. una vez ordenado se hace un recorrido simple contando cuantas veces se repite una letra
	public int firstAlgorithm(String data) {
		int result = 0;
		if(!data.isEmpty() && data.length() > 1) {
			char temporary[] = data.toLowerCase().toCharArray();
			Arrays.sort(temporary);
			int streakCounter = 1;
			for (int i = 0; i < temporary.length-1; i++) {
				if(temporary[i] == temporary[i+1]) {
					streakCounter += 1;
				}
				if(temporary[i] != temporary[i+1] || i == temporary.length-2) {
					if(streakCounter > 1) {
						result += 1;
					}
					streakCounter = 1;
				}
			}
		}
		return result;
	}
}
