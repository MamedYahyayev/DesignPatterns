package patterns;

public class MainMethod {

	public static void main(String[] args) {
		// Singleton Patterns ---------------------------------------
		SingletonPatterns patterns =  SingletonPatterns.getInstance();
		patterns.singletonWelcomeMessage();
		patterns.setId(1);
		patterns.setName("Samir");
		patterns.setSurname("Samirov");
		patterns.setSalary(2500);
		
		System.out.println(patterns);
		// -----------------------------------------------------------
		
	
	}
	
}
