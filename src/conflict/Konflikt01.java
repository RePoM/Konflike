package conflict;

public class Konflikt01 {
	
	public class Person {
		
		private String firstName;
		private String lastName;
		private int age;
		
		public Person(String fN, String lN, int age) {
			this.firstName = fN;
			this.lastName = lN;
			this.age = age;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
	}
	
	
}
