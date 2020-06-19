package decorator;

public class IPhone implements Phone{

	@Override
	public String getName() {
		return "Iphone ";
	}

	@Override
	public int getCameraCount() {
		return 2;
	}

	@Override
	public double getPrice() {
		return 600;
	}


	
	
	

}
