package decorator;

public class IPhone11Pro extends PhoneDecorator {

	public IPhone11Pro(IPhone basicPhone) {
		super(basicPhone);
	}

	@Override
	public double getPrice() {
		return basicPhone.getPrice() + 500;
	}

	@Override
	public String getName() {
		return super.getName() + "11 Pro";
	}

	@Override
	public int getCameraCount() {
		return super.getCameraCount() + 1;
	}
}
