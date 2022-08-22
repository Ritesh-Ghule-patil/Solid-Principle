package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		
		IWorker manager = new  Manager();
		manager.startEat();
		manager.stopWork();
		manager.startEat();
		manager.stopEat();
		
		System.out.println("_____________________________\n");
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		robot.startEat();
		robot.stopEat();
		
	}
}
