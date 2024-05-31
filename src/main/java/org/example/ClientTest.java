package org.example;

import org.example.Factory.CandyFactory;
import org.example.Product.Candy;
import org.example.enums.CandyType;

public class ClientTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());
        System.out.println("----------------------------");
        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());
    }
}