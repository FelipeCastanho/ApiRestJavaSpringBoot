package com.felipe.model;

import java.util.Arrays;
import org.springframework.stereotype.Service;
import com.felipe.ApiRestJavaSpringBootApplication;

@Service
public class CountDuplicatesModel {
	
	
	// This function converts string characters to lowercase, then saves them in an array, 
	// after sort function is applying, and finally, a simple tracking is executing counting 
	// how many times a letter is repeated.
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
	
	// This function converts string characters to lowercase, then saves them in an array,
	// then an array called countByLetter is created, this array represent the number of occurrences 
	// for a letter or number, and finally, the character array is iterated, adding every occurrence found
	
	// Unlike the firstAlgorithm function, this function does not order the string (complexity n ^ 2).
	// instead, an array of 36 positions is created, which is run twice and then the array of characters 
	// of size n is run once. Therefore for a n > 9 this algorithm will be more optimal than the previous one
	public int secondAlgorithm(String data) {
		int result = 0;
		if(!data.isEmpty() && data.length() > 1) {
			
			int countByLetter[] = new int[36];
			for (int i = 0; i < countByLetter.length; i++) {
				countByLetter[i] = 0;
			}
			
			char temporary[] = data.toLowerCase().toCharArray();
			
			for (int i = 0; i < temporary.length; i++) {
				int ascii = (int) temporary[i];
				if(ascii < 58) {
					ascii -= 48;
				}else {
					ascii -= 87;
				}
				countByLetter[ascii] += 1;
			}
			for (int i = 0; i < countByLetter.length; i++) {
				if(countByLetter[i] > 1) {
					result += 1;
				}
			}
			
		}
		return result;
	}
}
