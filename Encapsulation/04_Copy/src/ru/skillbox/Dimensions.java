package ru.skillbox;

public class Dimensions {

    private final int length;
    private final int width;
    private final int height;
    private final int dimensions;


    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.dimensions = length * width * height;
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(length, width, height);
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(length, width, height);
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(length, width, height);
    }

    public int getDimensions() {
        return dimensions;

    }


}





