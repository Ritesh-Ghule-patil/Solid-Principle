package com.aurionpro.test;

import com.aurionpro.model.IHumanWorker;
import com.aurionpro.model.IWorkable;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		
		IHumanWorker manager = new  Manager();
		manager.startEat();
		manager.stopWork();
		manager.startEat();
		manager.stopEat();
		
		System.out.println("_____________________________\n");
		
		IWorkable robot = new Robot();
		robot.startWork();
		robot.stopWork();
	}
}
