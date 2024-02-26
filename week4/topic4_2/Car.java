package topic4_2;

public class Car {
private int year;
private String make; 
private String model; 
private int odometer; 
private double engineLiters; 
public Car() 
{ 
year = 0; 
make = ""; 
model = ""; 
odometer = 0; 
engineLiters = 0; 
}
public Car(int year, String make, String model, int odometer, double engineLiters) 
{ 
super(); 
this.year = year; 
this.make = make; 
this.model = model; 
this.odometer = odometer; 
this.engineLiters = engineLiters; 
}

// Getters
public int getYear() {
    return year;
}

public String getMake() {
    return make;
}

public String getModel() {
    return model;
}

public int getOdometer() {
    return odometer;
}

public double getEngineLiters() {
    return engineLiters;
}

}
