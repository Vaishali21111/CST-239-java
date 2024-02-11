package app;

public class Person {
	private String firstName = "Mark"; 
	private String lastName = "Reha";
	
	public String getFirstName () {
		return(this.firstName);
	}
	
	public String getLastName () {
		return(this.lastName);
	}
	
	public Person (String firstName , String lastName) {
		this.firstName = firstName; 
		this.lastName= lastName;
	}
	
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName= person.getLastName();
	}
	
	@Override 
	public boolean equals (Object other) {
		if (other == this) {
			System.out.println("Iam here in other == this");
			return true;
		}
		if (other == null) {
			System.out.println("Iam here in other == null");
			return false;
			
		}
		
		if (getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass() ");
			return false;
		}
		
		Person person = (Person) other; 
		return (this.firstName== person.firstName && this.lastName == person.lastName );
	}

	@Override 
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " +this.lastName;
	}
}
