package rental;

import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; 
import java.lang.*;
import java.util.*;

public class CarRental{
    public List<Car> cars;

    public CarRental(String filename){
        this.cars = new ArrayList<>();
        File obj = new File(filename);

        try(Scanner reader = new Scanner(obj)){
            while(reader.hasNextLine()){
                try{
                    String line = reader.nextLine();
                    List<String> splitLine = List.of(line.split("[:,]"));

                    Car newCar = Car.make(
                        splitLine.get(0),splitLine.get(1), 
                        Double.parseDouble(splitLine.get(2)));
                    if(newCar != null) this.cars.add(newCar);
                }
                catch(Exception e){

                }

            }
        } catch(Exception e){

        }

    }

    public int numberOfCars(){
        return this.cars.size();
    }

    @Override

    public String toString(){
        String out = "";
        for(Car car : cars){
            out += car.toString() + "\n";

        }
        return out;
    } 

    public void insertionSort(){
        for (int i = 1; i < cars.size(); i++) {
            Car key = cars.get(i); 
            int j = i - 1;

            while (j >= 0 && cars.get(j).getPrice() > key.getPrice()) {
                cars.set(j + 1, cars.get(j));
                j = j - 1;
            }

            cars.set(j + 1, key);
        }
    }

    public double weightedAverage(){
        if(cars.size() == 0) return -1.0;
        double whatIsthisEven = 0.0;
        double numberus = 0.0;
        for(int i = 0; i < cars.size(); i++){
            whatIsthisEven += cars.get(i) * (i + 1);
            numberus += i;
        }
        return whatIsthisEven / numberus;
    }

    public ArrayList<Car> sale(){
        if((int)Math.random() % 2 == 0) 
    }

}