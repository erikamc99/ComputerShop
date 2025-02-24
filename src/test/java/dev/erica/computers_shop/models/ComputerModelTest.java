package dev.erica.computers_shop.models;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerModelTest {
    @Test
    @DisplayName("Test del constructor del modelo de ordenador")
    void testComputerModel() {
        ComputerModel computer = new ComputerModel(Brand.ASUS, Memory.RAM_16GB, CPU.INTEL_I7, OS.WINDOWS_10, 1500.0);
        assertEquals(Brand.ASUS, computer.getBrand());
        assertEquals(Memory.RAM_16GB, computer.getMemory());
        assertEquals(CPU.INTEL_I7, computer.getCPU());
        assertEquals(OS.WINDOWS_10, computer.getOS());
        assertEquals(1500.0, computer.getPrice());
    }
}
