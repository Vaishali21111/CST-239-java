package app;

public class Person implements PersonInterface, Comparable<Person>{
	private String firstName = "Mark"; 
	private String lastName = "Reha";
	private boolean running = false;
	private int age; 
	
	public String getFirstName () {
		return(this.firstName);
	}
	
	public String getLastName () {
		return(this.lastName);
	}
	
	public Person (String firstName , String lastName , int age ) {
		this.firstName = firstName; 
		this.lastName= lastName;
		this.age=age;
		
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


	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I am walking");
		running= false;

	}


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Iam running");
		running= true;
		
	}

	public boolean isRunning() {
		// TODO Auto-generated method stub
		return running;
	}

	//@Override
	//public int compareTo(Person p) {
		// TODO Auto-generated method stub
		//int value = this.lastName.compareTo(p.lastName);
		//if (value == 0) {
			//return this.firstName.compareTo(p.firstName);
		//} 
		//else 
		//{
			//return value ; 
		//}
	
	 @Override
	    public int compareTo(Person otherPerson) {
		 return Integer.compare(this.age, otherPerson.age);
		 
	        
	   }
}

	
	
		


