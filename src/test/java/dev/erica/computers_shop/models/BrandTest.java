package dev.erica.computers_shop.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class BrandTest {
    @Test
    @DisplayName("Test del enum de la marca del ordenador")
    void testGetBrand() {
        assertEquals("Dell", Brand.DELL.getBrandName());
        assertEquals("HP", Brand.HP.getBrandName());
        assertEquals("Lenovo", Brand.LENOVO.getBrandName());
        assertEquals("Asus", Brand.ASUS.getBrandName());
        assertEquals("Acer", Brand.ACER.getBrandName());
        assertEquals("Apple", Brand.APPLE.getBrandName());
        assertEquals("Microsoft", Brand.MICROSOFT.getBrandName());
        assertEquals("Samsung", Brand.SAMSUNG.getBrandName());
        assertEquals("Google", Brand.GOOGLE.getBrandName());
        assertEquals("MSI", Brand.MSI.getBrandName());
        assertEquals("LG", Brand.LG.getBrandName());
        assertEquals("Toshiba", Brand.TOSHIBA.getBrandName());
        assertEquals("Huawei", Brand.HUAWEI.getBrandName());
        assertEquals("Razer", Brand.RAZER.getBrandName());
    }
}
