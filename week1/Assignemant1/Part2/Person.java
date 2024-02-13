
public class Person {
	
private String name ;
private int age;
private String favoriteColor ;

//constructor 
public Person(String name , int age , String favoriteColor) {
	this.name= name;
	this.age= age; 
	this.favoriteColor= favoriteColor;
}

//getters
public String getName() {
	return name;
}

public int getAge() {
	return age;
	
}
public String getFavoriteColor() {
	return favoriteColor;
}

//setters
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age= age; 
}
public void setFavoriteColor (String favoriteColor) {
	this.favoriteColor= favoriteColor; 
}
//behaviors 
public void walk() {
	System.out.println("I am walking");
}

public void run() {
	System.out.println("I am running");
}

public static void main(String[] args) {
	Person person = new Person("vaishali", 18 , "red"); 
	person.walk();
	person.run();
}

}





