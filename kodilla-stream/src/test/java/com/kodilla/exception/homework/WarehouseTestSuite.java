package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {

    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5/2021"));
        // when
        Order order = warehouse.getOrder("5/2021");

        // then
        assertEquals("5/2021", order.getNumber());

    }

    @Test
    public void testDoesOrderExist_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("24/2021"));
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("25/2021"));
    }


}
