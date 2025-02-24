package dev.erica.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ShopModelTest {
    private ShopModel shop;
    private ComputerModel computer;

    @BeforeEach
    public void setUp() {
        shop = new ShopModel("Ordenadores SL", "Eri", "123456789");
        computer = new ComputerModel(Brand.APPLE, Memory.RAM_256GB, CPU.APPLE_M1, OS.MACOS, 2000);
        shop.addComputer(computer);
    }
    @Test
    @DisplayName("Test del constructor de ShopModel y los getters")
    public void testShopModel() {
        assertEquals("Ordenadores SL", shop.getShopName());
        assertEquals("Eri", shop.getOwner());
        assertEquals("123456789", shop.getId());
    }

    @Test
    @DisplayName("Test de addComputer y computers List")
    public void testAddComputer() {
        ComputerModel computer2 = new ComputerModel(Brand.DELL, Memory.RAM_256GB, CPU.INTEL_I3, OS.WINDOWS_10, 500);
        shop.addComputer(computer2);
        assertEquals(1, shop.computerList().size(), 2);
    }
    
    @Test
    @DisplayName("Test de deleteComputer")
    public void testDeleteComputer() {
        shop.deleteComputer(Brand.APPLE, 1);
        assertEquals(0, shop.computerList().size(), 1);
    }

    @Test
    @DisplayName("Test para borrar un ordenador null")
    public void testDeleteComputerNull() {
        shop.deleteComputer(Brand.MICROSOFT, 2);
        assertEquals(1, shop.computerList().size(), 1);
    }
}