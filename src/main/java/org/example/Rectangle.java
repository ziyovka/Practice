package org.example;

public class Rectangle {
    private int a;
    private int b;
    Rectangle(int a,int b){
        this.a=a;
        this.b=b;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void  Square(int a, int b){
        System.out.println( a*b);
    }
    public void  P(int a, int b){
        System.out.println( (a+b)*2);
    }
}
