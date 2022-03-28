package ru.skillbox;

public class CargoInformation {

    private final  Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private boolean turnOff;
    private String registrationNumber;
    private boolean fragileCargo;

    public CargoInformation(Dimensions dimensions, int weight, String deliveryAddress, boolean turnOff, String registrationNumber, boolean fragileCargo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOff = turnOff;
        this.registrationNumber = registrationNumber;
        this.fragileCargo = fragileCargo;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public CargoInformation setDimensions(Dimensions dimensions) {
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

    public void setTurnOff(boolean turnOff) {
        this.turnOff = turnOff;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isFragileCargo() {
        return fragileCargo;
    }

    public void setFragileCargo(boolean fragileCargo) {
        this.fragileCargo = fragileCargo;
    }


}


