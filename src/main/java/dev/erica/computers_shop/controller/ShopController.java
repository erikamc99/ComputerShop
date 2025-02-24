package dev.erica.computers_shop.controller;

import dev.erica.computers_shop.models.*;

public class ShopController {

    private final ShopModel shop;

    public ShopController(ShopModel shop) {
        this.shop = shop;
    }

    public void addComputer(ComputerModel computer) {
        shop.addComputer(computer);
    }

    public void removeComputer(Brand brand, int id) {
        shop.deleteComputer(brand, id);
    }

    public void searchComputer(Brand brand) {
        shop.searchComputer(brand);
    }

    public void showAllComputers() {
        shop.computerList();
    }
}
