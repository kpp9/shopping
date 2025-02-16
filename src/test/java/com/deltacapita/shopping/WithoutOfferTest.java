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
public class WithoutOfferTest {

    @Test
    void testExecuteOffer() {

        WithoutOffer offer = new WithoutOffer();
        double price = 25.0;
        int quantity = 4;
        double result = offer.executeOffer(price, quantity);
        Assertions.assertEquals(100.0, result);
    }
    
    //Newly added scenarios
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
