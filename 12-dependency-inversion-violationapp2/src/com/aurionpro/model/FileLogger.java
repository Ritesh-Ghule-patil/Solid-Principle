package com.aurionpro.model;

public class FileLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("Logged To File");
	}

}
