package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
//		Fruit fruit = new Fruit();
//		Vegetable vegetable = new Vegetable();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		//Fruit myOtherFruit = appContext.getBean("fruitWithName", Fruit.class);
		//System.out.println(myOtherFruit.talkAboutYourself());

		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Vegetable myVegetable = (Vegetable)appContext.getBean("vegetable");
		Vegetable vegWithName = (Vegetable)appContext.getBean("vegWithName");
		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myVegetable.talkAboutYourself());
		System.out.println(vegWithName.talkAboutYourself());

		Fruit myOtherFruit = appContext.getBean("fruitWithListAndMap", Fruit.class);
		System.out.println(myOtherFruit.talkAboutYourself());

	}

}
