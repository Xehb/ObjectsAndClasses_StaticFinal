package ru.skillbox;

public class Main {

    public static void main(String[] args) {
     Dimensions cube = new Dimensions(4,1,-1);
     cube.calculateVolume();
     CargoInformation cargo1 = new CargoInformation(cube,5,"asf", true, "231123123", false);


        System.out.println(cargo1);



    }

}
