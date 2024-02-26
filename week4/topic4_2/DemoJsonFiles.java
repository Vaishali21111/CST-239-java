package topic4_2;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoJsonFiles {
	
	  private static void saveToFile(String filename, Car car, boolean append) {
	        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, append))) {
	            // Write Car as JSON
	        	//tronform object into a json
	            ObjectMapper objectMapper = new ObjectMapper();
	            String json = objectMapper.writeValueAsString(car);
	            pw.println(json);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static ArrayList<Car> readFromFile(String filename) {
	        ArrayList<Car> cars = new ArrayList<>();
	        try (Scanner s = new Scanner(new File(filename))) {
	            // Create list of Cars by reading JSON file
	            while (s.hasNext()) {
	                // Read a string of JSON and convert to a Car
	                String json = s.nextLine();
	                ObjectMapper objectMapper = new ObjectMapper();
	                Car car = objectMapper.readValue(json, Car.class);
	                cars.add(car);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return cars;
	    }
	public static void main(String[] args) throws IOException 
	{ 
	// Create some Cars using an array 
	// Discussion: Why is a List better to use then an array? 
	Car[] cars = new Car[5]; 
	cars [0] = new Car(2018, "Ford", "Mustang", 0, 1.5d); 
	cars [1]= new Car(2018, "Chevy", "Blazer", 1000, 1.5d); 
	cars [2]= new Car(2019, "Toyota", "Camery", 2000, 1.5d); 
	cars [3]= new Car (2018, "Toyota", "Avalon", 90000, 2.5d);
	cars [4]= new Car(2010, "GMC", "Silverado", 10000, 3.5d); 
	// Write the Cars to a file as JSON 
	for(int x=0; x < 4;++x) 
		
		
	{ 
		// Write Car to a file as JSON 
		saveToFile("out.json", cars [x], true); 
	} 

	
	// Read the Cars from the file and print out 
	ArrayList<Car>carsList = readFromFile("out.json"); 
	for (Car car : carsList) 
	{ 
	String text = Integer.toString(car.getYear()) + ","+
	car.getMake() +  "," + car.getModel() +  "," +
	Integer.toString(car.getOdometer()) +","
	+Double.toString(car.getEngineLiters()); 
	System.out.println(text); 
	} 
	} 


}
