package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private Shop shop;

    @Test
    public void shouldAddOrder() {

        // Given

        // When
        shop.add(new Order(40.50, LocalDate.of(2021, 12, 16), "user1"));

        // Then
        assertEquals(6, shop.count());
    }

    @Test
    public void shouldGetOrdersFromDatePeriod() {

        //When
        List<Order> result = shop.get(LocalDate.of(2021, 10, 7), LocalDate.of(2021, 10, 25));

        //Then
        assertEquals(3, result.size());
    }

//
//    @Test
//    public void shouldGetMaxValue() {
//
//        //When
//        Order getMaxValue = orders
//                .stream()
//                .max(Comparator.comparing(Order::getOrderValue))
//                .orElseThrow(NoSuchElementException::new);
//
//
//        assertEquals(254.0, getMaxValue);
//    }
//
//    @Test
//    public void shouldGetMinValue() {
//
//        //When
//        Order getMinValue = orders
//                .stream()
//                .min(Comparator.comparing(Order::getOrderValue))
//                .orElseThrow(NoSuchElementException::new);
//
//        assertEquals(100, getMinValue);
//    }
//
//    @Test
//    public void shouldGetSize() {
//
//        //When
//        shop.getSize();
//
//        //then
//        assertEquals(3, shop.getSize());
//        System.out.println("The number of all orders is " + shop.getSize());
//    }
//
//    @Test
//    public void shouldGetTotalValue() {
//
//        //When
//        shop.sum();
//
//        //Then
//        assertEquals(497.00, shop.sum());
//        System.out.println("Total value of all orders is " + shop.sum());
//
//    }

    @BeforeEach
    public void initializeShop() {
        shop = new Shop();
        shop.add(new Order(100.50, LocalDate.of(2021, 10, 10), "user1"));
        shop.add(new Order(10, LocalDate.of(2021, 10, 20), "user2"));
        shop.add(new Order(201.30, LocalDate.of(2021, 10, 5), "user3"));
        shop.add(new Order(16.50, LocalDate.of(2021, 10, 30), "user4"));
        shop.add(new Order(45.80, LocalDate.of(2021, 10, 9), "user5"));
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
