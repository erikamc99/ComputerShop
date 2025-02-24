package dev.erica.computers_shop.models;

import java.util.ArrayList;
import java.util.List;

public class ShopModel implements Shop {
    private final String shopName;
    private final String owner;
    private final String id;
    private final List<ComputerModel> computers;

    public ShopModel(String shopName, String owner, String id) {
        this.shopName = shopName;
        this.owner = owner;
        this.id = id;
        this.computers = new ArrayList<>();
    }

    @Override
    public String getShopName() { return shopName; }

    @Override
    public String getOwner() { return owner; }

    @Override
    public String getId() { return id; }

    @Override
    public List<ComputerModel> computerList() {
        return new ArrayList<>(computers);
    }
    
    @Override
    public void addComputer(ComputerModel computer) {
        computers.add(computer);
    }

    @Override
    public boolean deleteComputer(Brand brand, int id) {
        return computers.removeIf(c -> c.getBrand() == brand && c.getID() == id);
    }
}