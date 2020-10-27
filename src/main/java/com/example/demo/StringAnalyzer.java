package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {

	@RequestMapping(method = RequestMethod.GET)
	public String reverseString( @RequestParam("stringToBeReversed") String stringToBeAnalyzed) {

		for (int i = 0; i < stringToBeAnalyzed.length(); i++) {
			char oneChar = stringToBeAnalyzed.charAt(i);
			int lowerCaseCounter = 0, upperCaseCounter = 0, numericCounter = 0, specialSignCounter = 0;
			if (isLowerCase(oneChar)) {
				lowerCaseCounter++;
			} else if (isUpperCase(oneChar)) {
				upperCaseCounter++;
			} else if (isSpecialSign(oneChar)) {
				specialSignCounter++;
			} else if (isNumeric(onceChar)) {
				numericCounter++;
			}
		}

		return stringToBeAnalyzed;
	}
}
