package org.example;

public class Car {
    private String color;
    private String model;
    private int price;
    private boolean isManual;
    Car(String color,String model,int price,boolean isManual){
        this.color=color;
        this.model=model;
        this.price=price;
        this.isManual=isManual;
    }
//    public void display(){
//        System.out.println(model +" "+ color +" "+ price +" "+ "Ismanual " +isManual);
//    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        System.out.println(getColor()+" "+ getPrice()+" "+getModel()+" "+isManual);
    }
}
