package ru.skillbox;

public class Main {

    public static void main(String[] args) {
     Dimensions cube = new Dimensions(4,1,-1);

     CargoInformation cargo1 = new CargoInformation(cube.getDimensions(),5,"asf", true, "231123123", false);
     System.out.println("Номер груза:  " + cargo1.getRegistrationNumber()
             +"\n" + "Объем груза:  " + cargo1.getDimensions() + " (метров в кубе)"
             +"\n" + "Вес груза:  " + cargo1.getWeight() + " (кг)");



    }

}
