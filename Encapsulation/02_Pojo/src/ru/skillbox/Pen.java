package ru.skillbox;

public class Pen {
    private String colorPen = "";
    private String typePen = "";
    private int amount = 0;

    public Pen(String colorPen, String typePen) {
        this.colorPen = colorPen;
        this.typePen = typePen;
    }

    public String getColorPen() {
        return colorPen;
    }

    public void setColorPen(String colorPen) {
        this.colorPen = colorPen;
    }

    public String getTypePen() {
        return typePen;
    }

    public void setTypePen(String typePen) {
        this.typePen = typePen;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



}
