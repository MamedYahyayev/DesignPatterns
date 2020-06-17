package factoryPatterns;

public class NullClass implements Calculator {

	@Override
	public void welcomeMsg() {
		System.out.println("This class is not exists");
	}

}
