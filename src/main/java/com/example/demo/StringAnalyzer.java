package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {

	@RequestMapping(method = RequestMethod.GET)
	public String reverseString( @RequestParam("stringToBeReversed") String stringToBeAnalyzed) {

		return stringToBeAnalyzed;
	}
}
