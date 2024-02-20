package app;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		//create a bunch of persons and compare them so they are sorted on last name 
		Person[]persons = new Person [4];
		persons[0]= new Person("Justine", "Reha" ,22 );
		persons[1] = new Person("Brianna", "Reha" , 40);
		persons[2] = new Person ("Mary" , "Reha" ,30 );
		persons[3] = new Person ("Mark", "Reha" ,19) ;
		
		Arrays.sort(persons);
		
		for (int x=0 ; x<4 ; ++x) {
			System.out.println(persons[x]);
		}
		
		
		
		
		
		//make a person walk and run 
		//person1.walk();
		//person1.run();
		//System.out.println("Person 1 is running :"+ person1.isRunning());
		//person1.walk(); 
		//System.out.println("Person 1 is running :"+ person1.isRunning());
		
		
		
		
		
	}

}
