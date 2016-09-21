package conflict;

public class Konflikt01 {
	
	public class Person {
		
		private String firstName;
		private String lastName;
		private int age;
		
		public Person(String fN, String lN, int age) {
			this.setFirstName(fN);
			this.setLastName(lN);
			this.age = age;
		}


		public void setFirstName(String firstName) throws IllegalArgumentException {
			
			if(firstName.isEmpty()) throw new IllegalArgumentException("cant");

			this.firstName = firstName;
		}


		public void setLastName(String lastName) throws IllegalArgumentException{

			if(lastName.isEmpty()) throw new IllegalArgumentException("cant");

			this.lastName = lastName;
		}
		
	}
	
	
}
