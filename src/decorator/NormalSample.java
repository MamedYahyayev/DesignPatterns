package decorator;

public class NormalSample {

	public static class Iphone8 {
		String name(){
			return "Iphone 8";
		}
		
		int getCameraCount() {
			return 2;
		}
	}
	
	public static class Iphone11 {
		String name(){
			return "Iphone 11";
		}

		
		int getCameraCount() {
			return 3;
		}
	}
	
	public static class Iphone11Max {
		String name(){
			return "Iphone 11Max";
		}

		int getCameraCount() {
			return 3;
		}
	}

}
