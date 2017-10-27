package designpatterns.strategy.app;

import designpatterns.strategy.Duck;
import designpatterns.strategy.FlyRocketPowered;
import designpatterns.strategy.MallardDuck;
import designpatterns.strategy.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
