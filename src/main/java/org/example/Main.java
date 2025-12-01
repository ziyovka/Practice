package org.example;
//import javax.sound.sampled.*;
//import java.io.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
Car mycar=new Car("Black","Audi",75000,true);
Rectangle myrect=new Rectangle(5,7);
Point p=new Point(4,6,2);
        System.out.println("X: "+p.getX());
        System.out.println("Y: "+p.getY());
        System.out.println("Z: "+p.getZ());
        mycar.display();
       myrect.Square(2,6);
       myrect.P(5,7);

    }
}
