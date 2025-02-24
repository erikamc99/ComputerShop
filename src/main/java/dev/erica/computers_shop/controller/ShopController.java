package dev.erica.computers_shop.controller;

import java.util.List;

import dev.erica.computers_shop.models.Brand;
import dev.erica.computers_shop.models.ComputerModel;
import dev.erica.computers_shop.models.ShopModel;

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

    public List<ComputerModel> searchComputer(Brand brand) {
        return shop.searchComputer(brand);
    }

    public List<ComputerModel> showAllComputers() {
       return shop.computerList();
    }
}
