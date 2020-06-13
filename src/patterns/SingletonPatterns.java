package patterns;

public class SingletonPatterns {

	private static final SingletonPatterns INSTANCE = new SingletonPatterns();

	private SingletonPatterns() {

	}

	private Integer id;
	private String name;
	private String surname;
	private float salary;

	public static SingletonPatterns getInstance() {
		return INSTANCE;
	}

	void singletonWelcomeMessage() {
		System.out.println("Welcome Singleton Patterns");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + "\n name=" + name + "\n surname=" + surname + "\n salary=" + salary;
	}

}
