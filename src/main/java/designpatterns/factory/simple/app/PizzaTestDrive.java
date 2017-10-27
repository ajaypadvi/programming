package designpatterns.factory.simple.app;

import designpatterns.factory.simple.Pizza;
import designpatterns.factory.simple.PizzaStore;
import designpatterns.factory.simple.SimplePizzaFactory;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");

		pizza = store.orderPizza("veggie");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
}
