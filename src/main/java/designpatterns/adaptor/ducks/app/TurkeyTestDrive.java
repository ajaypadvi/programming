package designpatterns.adaptor.ducks.app;

import designpatterns.adaptor.ducks.DuckAdapter;
import designpatterns.adaptor.ducks.MallardDuck;
import designpatterns.adaptor.ducks.Turkey;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
