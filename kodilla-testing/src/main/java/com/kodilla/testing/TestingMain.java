package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        //test User
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result1 = simpleUser.getUsername();

        if (result1.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test Calculator add
        System.out.println("\nTest Calculator - addition\n");

        Calculator calculator = new Calculator();

        Integer result2 = calculator.add(50, 25);

        if (result2.equals(75)) {
            System.out.println("test passed!");
        } else {
            System.out.println("Error!");
        }

        //test Calculator substract
        System.out.println("\nTest Calculator - substraction\n");

        Integer result3 = calculator.substract(50, 40);

        if (result3.equals(25)) {
            System.out.println("test passed!");
        } else {
            System.out.println("Error!");
        }

    }
}