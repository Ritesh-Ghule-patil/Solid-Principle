package com.aurionpro.test;

import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		
		TaxCalculator calulate = new TaxCalculator(LogType.DB);
		calulate.calculateTax(1000, 0);
		
		TaxCalculator calc = new TaxCalculator(LogType.FILE);
		System.out.println(calc.calculateTax(100, 10));
		
	}
}
