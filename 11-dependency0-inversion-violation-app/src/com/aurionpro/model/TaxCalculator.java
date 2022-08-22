package com.aurionpro.model;

public class TaxCalculator {

	LogType logger;

	public TaxCalculator(LogType logger) {
		super();
		this.logger = logger;
	}

	public double calculateTax(int ammount, int rate) {
		double tax = 0;
		try {
			tax =ammount/rate;

		} catch (Exception e) {

			if (logger == LogType.DB) {
				new DBLogger().log("an exception occure..!!");
			} else if (logger == LogType.FILE) {
				new FileLogger().log("an exception occure..!!");
			}
		}

		return tax;
	}
}
