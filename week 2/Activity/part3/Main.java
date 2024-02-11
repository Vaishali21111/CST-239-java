package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Vaishali" , "Livingston");
		Person person2 = new Person ("Vaishali" , "Livingston");
		Person person3 = new Person(person1);
		
		if (person1 == person2 ) {
			System.out.println("These persons are identical using ==") ;
		}else {
			System.out.println("These persons are not identical using ==") ;
			
		}
		
		if(person1.equals(person2)) {
			System.out.println("These persons are identical using equals") ;
			
		}else {
			System.out.println("These persons are not identical equals") ;

		
	}
		
		if(person1.equals(person3)) {
			System.out.println("These persons are identical using equals") ;
			
		}else {
			System.out.println("These persons are not identical equals") ;

		
	}
		
		System.out.println(person1);
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		
		
		
	}

}
