package ru.skillbox;

public class Dimensions {
    private int length;
    private int width;
    private int height;
    public int volume;


    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
        public int getLength () {
            return length;
        }

        public void setLength ( int length){
            this.length = length;
        }

        public int getWidth () {
            return width;
        }

        public void setWidth ( int width){
            this.width = width;
        }

        public int getHeight () {
            return height;
        }

        public void setHeight ( int height){
            this.height = height;
        }


        public int calculateVolume () {
            this.volume= length * width * height;

            return  volume;
        }



    }
