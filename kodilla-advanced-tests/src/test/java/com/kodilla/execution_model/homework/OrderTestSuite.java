package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class OrderTestSuite {
        Shop shop = new Shop();
        Order firstOrder = new Order(143.00, 11.2020, "Jan Kowalski");
        Order secondOrder = new Order(254.00, 09.2020, "Piotr Dydkowski");
        Order thirdOrder = new Order(100.00, 10.2020, "Nina Zaborska");
        List<Order> orders = Arrays.asList(firstOrder, secondOrder, thirdOrder);

        @Test
        public void shouldAddOrders() {

            //When
            int numberOfOrders = shop.getSize();

            //Then
            assertEquals(3, numberOfOrders);
        }

        @Test
        public void shouldGetOrderFromOneYear() {

            //When
            Order result = shop.orderDate(10.2021, 11.2020);

            //Then
            assertEquals("firstOrder", result.getDate());
            assertEquals("Jan Kowalski", result.getCustomerLogin());
        }


        @Test
        public void shouldGetMaxValue() {

            //When
            Order getMaxValue = orders
                    .stream()
                    .max(Comparator.comparing(Order::getOrderValue))
                    .orElseThrow(NoSuchElementException::new);


            assertEquals(254.0, getMaxValue);
        }

        @Test
        public void shouldGetMinValue() {

            //When
            Order getMinValue = orders
                    .stream()
                    .min(Comparator.comparing(Order::getOrderValue))
                    .orElseThrow(NoSuchElementException::new);

            assertEquals(100, getMinValue);
        }

        @Test
        public void shouldGetSize() {

            //When
            shop.getSize();

            //then
            assertEquals(3, shop.getSize());
            System.out.println("The number of all orders is " + shop.getSize());
        }

        @Test
        public void shouldGetTotalValue() {

            //When
            shop.sum();

            //Then
            assertEquals(497.00, shop.sum());
            System.out.println("Total value of all orders is " + shop.sum());

        }

        @BeforeEach
        public void initializeShop() {
            shop.addOrder(firstOrder);
            shop.addOrder(secondOrder);
            shop.addOrder(thirdOrder);
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
