package ru.skillbox;

public class Country {

    private String name = "";
    private int population = 0;
    private int square = 0;                 // в квадратных километрах
    private String nameCapital = "";
    boolean accessSea = true;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isAccessSea() {
        return accessSea;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }
}

