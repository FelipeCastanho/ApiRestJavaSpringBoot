package com.felipe.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.model.CountDuplicatesModel;
import com.felipe.model.DataReceived;

@RestController
@RequestMapping("/countDuplicate")
public class RestCountDuplicatesController {

	@Autowired
	CountDuplicatesModel countDuplicatesModel;
	
	@GetMapping("/firstAlgorithm/{data}")
	public Map<String, Integer> countDuplicates1(@PathVariable(value = "data") String data) {
		int result = countDuplicatesModel.firstAlgorithm(data);
		Map<String, Integer> map = new HashMap<>();
		map.put(data, result);
		return map;
	}
	
	@GetMapping("/secondAlgorithm/{data}")
	public Map<String, Integer> countDuplicates2(@PathVariable(value = "data") String data) {
		int result = countDuplicatesModel.secondAlgorithm(data);
		Map<String, Integer> map = new HashMap<>();
		map.put(data, result);
		return map;
	}
	
	@PostMapping
	public List<DataReceived> countDuplicates2(@RequestBody List<DataReceived> list) {
		list.stream().forEach(x -> x.setResult(countDuplicatesModel.secondAlgorithm(x.getData())));
		return list;
	}
}
