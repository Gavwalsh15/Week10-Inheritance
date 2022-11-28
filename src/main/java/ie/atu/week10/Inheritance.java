package ie.atu.week10;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
       Person gavin = new Person();
       gavin.setName("Gavin");
       gavin.setAddress("H91YXC4");
       gavin.setTelephone("085 7486559");

        System.out.println("My details are\n" + gavin.getName() +"\n"+ gavin.getAddress()+"\n" + gavin.getTelephone());
    }
}
