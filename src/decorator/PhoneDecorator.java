package decorator;



public class PhoneDecorator implements Phone {

	protected Phone basicPhone;

	public PhoneDecorator(IPhone basicPhone) {
		this.basicPhone = basicPhone;
	}

	@Override
	public String getName() {
		return basicPhone.getName();
	}

	@Override
	public int getCameraCount() {
		return basicPhone.getCameraCount();
	}

	@Override
	public double getPrice() {
		return basicPhone.getPrice();
	}

}
