package ru.skillbox;

public class Main {

    public static void main(String[] args) {
     Dimensions cube = new Dimensions(4,1,-1);
        cube.calculateVolume();

     CargoInformation cargo1 = new CargoInformation(5,"asf", true, "231123123", false, cube);
     System.out.println("Номер груза:  " + cargo1.getRegistrationNumber()
             +"\n" + "Объем груза:  " + cargo1.getDimensions().calculateVolume() + " (метров в кубе)"
             +"\n" + "Вес груза:  " + cargo1.getWeight() + " (кг)");




    }

}
