package dev.erica.computers_shop.models;


public class ComputerModel implements Computer {
    private final Brand brand;
    private final Memory memory;
    private final CPU CPU;
    private final OS OS;
    private double price;

    public ComputerModel(Brand brand, Memory memory, CPU CPU, OS OS, double price) {
        this.brand = brand;
        this.memory = memory;
        this.CPU = CPU;
        this.OS = OS;
        this.price = price;
    }

    @Override
    public Brand getBrand() { return brand; }

    @Override
    public Memory getMemory() { return memory; }

    @Override
    public CPU getCPU() { return CPU; }

    @Override
    public OS getOS() { return OS; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Ordenador:" +
                " marca: " + brand.getBrandName() +
                ", memoria RAM: " + memory.getCapacity() + "GB" +
                ", CPU: " + CPU.getCPUName() +
                ", OS: " + OS.getOSName() +
                ", precio: " + price + "€";
    }
}
