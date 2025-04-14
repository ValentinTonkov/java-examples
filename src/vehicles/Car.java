package vehicles;

public class Car {
    private String brand;
    private int year;
    private String color;
    private int power;

    public Car(String brand, int year, String color, int power) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }
}
