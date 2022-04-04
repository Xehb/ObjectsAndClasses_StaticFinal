package ru.skillbox;

public class CargoInformation {

    private final Dimensions dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean turnOff;
    private final String registrationNumber;
    private final boolean fragileCargo;

    public CargoInformation(int weight, String deliveryAddress, boolean turnOff, String registrationNumber, boolean fragileCargo, Dimensions calculateVolume) {
        this.dimensions = calculateVolume;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOff = turnOff;
        this.registrationNumber = registrationNumber;
        this.fragileCargo = fragileCargo;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }


    public CargoInformation setDimensions(Dimensions calculateVolume) {
        return new CargoInformation(weight, deliveryAddress, turnOff, registrationNumber, fragileCargo, calculateVolume);
    }

    public int getWeight() {
        return weight;
    }

    public CargoInformation setWeight(int weight) {
        return new CargoInformation(weight, deliveryAddress, turnOff, registrationNumber, fragileCargo, dimensions);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(weight, deliveryAddress, turnOff, registrationNumber, fragileCargo, dimensions);
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


