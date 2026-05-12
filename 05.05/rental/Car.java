package rental;

import java.util.*;

public class Car{
    private String brand;
    private String licensePlate;
    private double price;

    private static final double MAX_PRICE = 500;

    private Car(String brand, String licensePlate, double price){
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public static Car make(String brand, String licensePlate, double price){
        if(isValidCar(brand, licensePlate, price)){
            return new Car(brand, licensePlate, price);
        }
        return null;
    }

    private static boolean isValidCar(String brand, String licensePlate, double price){
        if( brand.matches("^[a-zA-Z ]{2,}$") &&
            isValidLicensePlate(licensePlate) &&
            price >= 0 && price <= MAX_PRICE) return true;
        return false;
        
    }

    private static boolean isValidLicensePlate(String licensePlate){
        if( licensePlate.matches("^[A-Z]{3} [0-9]{3}$")) return true;
        return false;
    }

    public void decreasePrice(){
        if(this.price == MAX_PRICE) return;
        if(this.price >= 10) this.price -= 10;
    }

    public boolean isCheaperThan(Car other){
        if(other.price == this.price) return false;
        return (other.price > this.price);
    }

    @Override
    public String toString(){
        return String.format("%s (%s): %.1f", 
        this.brand, this.licensePlate, this.price);
    }

}