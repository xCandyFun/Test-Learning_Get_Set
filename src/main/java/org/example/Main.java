package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static Car car = new Car();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        test();
    }

    public static void test(){
        car.setName("Volvo");
        car.setColor("Green");
        car.setYear("2017");
        List<String> listOfCar = new ArrayList<String>();
        listOfCar.add(car.getName());
        listOfCar.add(car.getColor());
        listOfCar.add(car.getYear());
        System.out.println(listOfCar.get(1));
    }
}