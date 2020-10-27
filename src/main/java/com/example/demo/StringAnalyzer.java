package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

@RestController
public class StringAnalyzer {

	@RequestMapping(method = RequestMethod.GET)
	public String reverseString( @RequestParam("stringToBeAnalyzed") String stringToBeAnalyzed) {

		int lowerCaseCounter = 0, upperCaseCounter = 0, numericCounter = 0, specialSignCounter = 0;

		for (int i = 0; i < stringToBeAnalyzed.length(); i++) {
			char oneChar = stringToBeAnalyzed.charAt(i);
			if (isLowerCase(oneChar)) {
				lowerCaseCounter++;
			} else if (isUpperCase(oneChar)) {
				upperCaseCounter++;
			} else if (isSpecialSign(oneChar)) {
				specialSignCounter++;
			} else if (isNumeric(oneChar)) {
				numericCounter++;
			}
		}

		StringBuilder stringBuilder = new StringBuilder();

		if (lowerCaseCounter > 0) {
			stringBuilder.append("There are " + lowerCaseCounter + " lower case letters\n");
		}
		if (upperCaseCounter > 0) {
			stringBuilder.append("There are " + upperCaseCounter + " upper case letters\n");
		}
		if (specialSignCounter > 0) {
			stringBuilder.append("There are " + specialSignCounter + " special signs\n");
		}
		if (numericCounter > 0) {
			stringBuilder.append("There are " + numericCounter + " numeric signs\n");
		}

		return stringBuilder.toString();
	}

	private boolean isSpecialSign(char oneChar) {
		if ("/!@#$%^&*()_+-=;':\"{}[]".indexOf(oneChar) != -1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isNumeric(char oneChar) {
		if (Character.isDigit(oneChar)) {
			return true;
		} else {
			return false;
		}
	}
}
