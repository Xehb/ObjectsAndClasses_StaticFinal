package ru.skillbox;

public class CargoInformation {

    private final  int dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean turnOff;
    private final String registrationNumber;
    private final boolean fragileCargo;

    public CargoInformation(int dimensions, int weight, String deliveryAddress, boolean turnOff, String registrationNumber, boolean fragileCargo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOff = turnOff;
        this.registrationNumber = registrationNumber;
        this.fragileCargo = fragileCargo;
    }


    public int getDimensions() {
        return dimensions;
    }

    public CargoInformation setDimensions(int dimensions) {
        return new CargoInformation(dimensions, weight, deliveryAddress,  turnOff, registrationNumber, fragileCargo);
    }

    public int getWeight() {
        return weight;
    }

    public CargoInformation setWeight(int weight) {
        return new CargoInformation(dimensions, weight, deliveryAddress, turnOff, registrationNumber, fragileCargo);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(dimensions, weight, deliveryAddress, turnOff, registrationNumber, fragileCargo);
    }

    public boolean isTurnOff() {
        return turnOff;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public boolean isFragileCargo() {
        return fragileCargo;
    }




}


