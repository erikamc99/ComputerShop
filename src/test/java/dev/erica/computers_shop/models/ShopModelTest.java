package dev.erica.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShopModelTest {

    @Test
    @DisplayName("Test del constructor de ShopModel y los getters")
    public void testShopModel() {
        ShopModel shop = new ShopModel("Ordenadores SL", "Eri", "123456789");
        assertEquals("Ordenadores SL", shop.getShopName());
        assertEquals("Eri", shop.getOwner());
        assertEquals("123456789", shop.getId());
    }

    @Test
    @DisplayName("Test de addComputer and computers List")
    public void testAddComputer() {
        ShopModel shop = new ShopModel("Ordenadores SL", "Eri", "123456789");
        ComputerModel computer = new ComputerModel(Brand.APPLE, Memory.RAM_256GB, CPU.APPLE_M1, OS.MACOS, 2000);
        shop.addComputer(computer);
        assertEquals(1, shop.computerList().size(), 1);
        }
}