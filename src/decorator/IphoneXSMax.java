package decorator;

public class IphoneXSMax extends PhoneDecorator{

	public IphoneXSMax(IPhone basicPhone) {
		super(basicPhone);
	}

	@Override
	public String getName() {
		return basicPhone.getName() + "11 XS Max";
	}
	
	@Override
	public double getPrice() {
		return basicPhone.getPrice() + 1500;
	}
	
	

}
