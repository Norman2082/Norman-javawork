package liskov_substituiton;

public class Animal {
	public void learnToFly(FlyingBird flyBird) {
		flyBird.fly();
	}
}
