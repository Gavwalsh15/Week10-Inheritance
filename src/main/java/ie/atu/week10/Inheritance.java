package ie.atu.week10;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
       Person gavin = new Person();
       gavin.setName("Gavin");
       gavin.setAddress("H91YXC4");
       gavin.setTelephone("085 7486559");

        System.out.println("My details are:\n" + gavin.getName() +"\n"+ gavin.getAddress()+"\n" + gavin.getTelephone());

        Customer cillian = new Customer();
        cillian.setName("Cillian");
        cillian.setAddress("Barna");
        cillian.setTelephone("091 0000000");
        cillian.setCustomerNumber("420");
        cillian.setMailingList(true);

        System.out.println("Cillian's details are:\n" + cillian.getName() +"\n"+ cillian.getAddress()+"\n" + cillian.getTelephone()
                +"\n"+ cillian.getCustomerNumber()+"\n"+ cillian.isMailingList());
    }
}
