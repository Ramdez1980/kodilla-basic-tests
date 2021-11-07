package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WarehouseTestSuite {
    String number;
    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        Order doesOrderExist = warehouse.getOrder("5/2021");

        // then
        assertTrue((BooleanSupplier) doesOrderExist);

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
