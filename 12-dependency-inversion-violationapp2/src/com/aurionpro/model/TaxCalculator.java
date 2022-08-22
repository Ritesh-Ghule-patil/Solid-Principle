package com.aurionpro.model;

public class TaxCalculator {

	ILogger logger;

	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}

	public double calculateTax(int ammount, int rate) {
		double tax = 0;
		try {
			tax = ammount / rate;

		} catch (Exception e) {

			logger.log();

		}

		return tax;
	}
}
