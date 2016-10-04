package conflict;

public class Konflikt01 {
	
	public class Person {
		
		private String firstName;
		private String lastName;
		
		public Person(String fN, String lN) {
			this.firstName = fN;
			this.lastName = lN;
		}


		public void setFirstName(String firstName){

			this.firstName = firstName;
		}


		public void setLastName(String lastName){

			this.lastName = lastName;
		}
		
	}
	
	
}
