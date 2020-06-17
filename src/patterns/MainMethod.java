package patterns;
import builderPattern.Student;
import builderPattern.Student.StudentBuilder;
import factoryPatterns.Calculator;
import factoryPatterns.CalculatorEnum;
import factoryPatterns.CalculatorFactory;
import singletonPatterns.*;

import singletonPatterns.SingletonPatterns;

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
		
		//Factory Pattern
		
		Calculator calculator = new CalculatorFactory().getCalculator(CalculatorEnum.IPHONE);
		calculator.welcomeMsg();
		
		// ---------------------------------------------------------------------------
		
		// Builder Pattern
		Student student = new Student.StudentBuilder()
					.id(1L)
					.name("Qasim")
					.surname("Qasimov")
					.age(25)
					.address("Xetai")
					.degree("Master")
					.build();
		
			System.out.println(student);
	}

}
