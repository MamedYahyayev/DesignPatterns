package builderPattern;

public class Student {
	private Long id;
	private String name;
	private String surname;
	private int age;
	private String address;
	private String degree;

	public static class StudentBuilder {
		private Long id;
		private String name;
		private String surname;
		private int age;
		private String address;
		private String degree;

		
		public StudentBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder degree(String degree) {
			this.degree = degree;
			return this;
		}

		public Student build() {
			Student student = new Student();
			student.id = this.id;
			student.name = this.name;
			student.surname = this.surname;
			student.age = this.age;
			student.address = this.address;
			student.degree = this.degree;

			return student;
		}

	}

	private Student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", address=" + address
				+ ", degree=" + degree + "]";
	}

}
