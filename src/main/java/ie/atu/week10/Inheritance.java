package ie.atu.week10;


public class Inheritance {

    public static void main(String[] args) {
       Person gavin = new Person();
       gavin.setName("Gavin");
       gavin.setAddress("H91YXC4");
       gavin.setTelephone("085 7486559");

        System.out.println("My details are:\n" + gavin.toString());

        Customer cillian = new Customer();
        cillian.setName("Cillian");
        cillian.setAddress("Barna");
        cillian.setTelephone("091 0000000");
        cillian.setCustomerNumber("420");
        cillian.setMailingList(true);



        System.out.println("Cillian's details are:\n" + cillian.toString());

    }
}
