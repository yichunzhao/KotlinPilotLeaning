package interOperJava;

import classes.Customer;

import java.util.UUID;

public class DemoCallKotlinFromJava {

    public static void main(String[] args) {
        //using kotlin class from java
        Customer c = new Customer(UUID.randomUUID(), "yz");

        System.out.println(c.getName());

    }
}
