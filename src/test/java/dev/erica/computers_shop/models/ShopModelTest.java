package dev.erica.computers_shop.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShopModelTest {

    @Test
    @DisplayName("Test del constructor de ShopModel")
    public void testShopModel() {
        ShopModel shop = new ShopModel("Ordenadores SL", "Eri", "123456789");
        assertEquals("Ordenadores SL", shop.getShopName());
        assertEquals("Eri", shop.getOwner());
        assertEquals("123456789", shop.getId());
    }
}