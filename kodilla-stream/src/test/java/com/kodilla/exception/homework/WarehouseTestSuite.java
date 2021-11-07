package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseTestSuite {

    @Test
    public void testDoesOrderExist() {
        // given
        Order order = new Order("18/2021");
        // when
        String doesOrderExist = order.getNumber();

        // then
        assertFalse(Boolean.parseBoolean(doesOrderExist));

    }

    @Test
    public void testDoesOrderExist_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("25/2021"));
    }


}
