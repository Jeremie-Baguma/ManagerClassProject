class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class Hello {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
        System.out.println("Hello world!");
    }
}
