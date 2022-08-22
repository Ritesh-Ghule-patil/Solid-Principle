package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.ILogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		

		 TaxCalculator taxCalculator = new TaxCalculator(new FileLogger());
		 taxCalculator.calculateTax(100, 0);
	}
}
