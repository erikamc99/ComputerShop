package dev.erica.computers_shop.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.erica.computers_shop.models.*;

public class ShopControllerTest {
    @Test
    @DisplayName("Test para añadir un ordenador desde el controlador")
    public void testAddComputer() {
        ShopModel shop = new ShopModel("Computer Shop", "Pepito", "123456789");
        ShopController controller = new ShopController(shop);
        controller.addComputer(new ComputerModel(Brand.ASUS, Memory.RAM_16GB, CPU.AMD_RYZEN5, OS.WINDOWS_10, 1500));
        assertEquals(shop.computerList().size(), 1);
    }
}
