package org.anudip.javaappassignment02.operation;

public class EvenOddNumber {
	public String defineEvenNumber() {
		return "";
	}
	
	public String defineOddNumber() {
		return "";
	}
	
	public String verifyIfNumberIsEvenOrOdd(int num) {
		String result = "Odd Number";
		
		if(num < 0) {
			result = "-1";
		} else if(num == 0) {
			result = "-2";
		} else if((num % 2) == 0) {
			result = "Even Number";
		}
		
		return result;
	}
}