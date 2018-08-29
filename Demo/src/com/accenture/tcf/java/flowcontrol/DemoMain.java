package com.accenture.tcf.java.flowcontrol;

import java.rmi.dgc.Lease;

public class DemoMain {

	public static void main(String[] args) {

		int age = 20;

		/*System.out.println("checking while loop");
		while (age >= 18) {
			System.out.println("Batang bata");
			age--;
		}*/

		/*System.out.println("checking do - while loop");
		do {
			System.out.println("Batang bata");
			age--;
		} while (age > 18);*/

		/*for(int i = 0;i < 100; i++){
			System.out.println(i);
		}*/

		/*String[] names = new String[10];

		names[4] = "JV";

		for(String name : names){

			if ("JV".equals(name)) {
				System.out.println(name);
			}
		}*/

		Learner learner = new Learner();

		learner.setName("JV");
		learner.setAge(18);
//		System.out.println(learner.getName());
//		System.out.println(learner.getAge());
		System.out.println(learner);
		learner.compute();

		Learner l = new Learner("Renz", 15);
		System.out.println(l);
		l.compute();










	}

}
