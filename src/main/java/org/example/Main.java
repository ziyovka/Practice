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

        System.out.println(myrect.Square(5,3));
        System.out.println(mycar.price);
        System.out.println(mycar.model);
        System.out.println(mycar.color);
        System.out.println(mycar.isManual);
    }
}
