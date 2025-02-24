package dev.erica.computers_shop.models;

public class ShopModel implements Shop {
    private final String shopName;
    private final String owner;
    private final String id;

    public ShopModel(String shopName, String owner, String id) {
        this.shopName = shopName;
        this.owner = owner;
        this.id = id;
    }

    @Override
    public String getShopName() { return shopName; }

    @Override
    public String getOwner() { return owner; }

    @Override
    public String getId() { return id; }
}