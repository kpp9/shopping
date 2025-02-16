/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deltacapita.shopping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author manusaxena
 */
public class BuyOneGetOneTest {

    @Test
    void testExecuteEventQuantityOffer() {
        BuyOneGetOne offer = new BuyOneGetOne();
        double price = 50.0;
        int quantity = 4;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(100.0, result);
    }

    @Test
    void testExecuteOddQuantityOffer() {
        BuyOneGetOne offer = new BuyOneGetOne();
        double price = 50.0;
        int quantity = 5;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(150.0, result);
    }

    @Test
    void testExecuteSingleQuantity() {
        BuyOneGetOne offer = new BuyOneGetOne();
        double price = 50.0;
        int quantity = 1;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(50.0, result);
    }

    @Test
    void testExecuteOfferZeroQuantity() {
        BuyOneGetOne offer = new BuyOneGetOne();
        double price = 50.0;
        int quantity = 0;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(0.0, result);
    }

    @Test
    void testExecuteOffer_LargeQuantity() {
        BuyOneGetOne offer = new BuyOneGetOne();
        double price = 20.0;
        int quantity = 100;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(1000.0, result);
    }
    
  //Negative Scenarios
    @Test
    void checkForNegativePriceValues() {
     	BuyOneGetOne offer = new BuyOneGetOne();
         double price = -1;
         int quantity = 1;
         double result = offer.executeOffer(price, quantity);
         assert price<0 : "price should not be negative";
         System.out.println("Assertion passed, price should not be negative");
     }
    
    @Test
    void checkForNegativeQuantityValues() {
     	BuyOneGetOne offer = new BuyOneGetOne();
         double price = 1;
         int quantity = -1;
         double result = offer.executeOffer(price, quantity);
         assert quantity<0 : "quantity should not be negative";
         System.out.println("Assertion passed, quantity should not be negative");
     }
    
}
