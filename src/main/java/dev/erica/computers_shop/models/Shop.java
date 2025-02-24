package dev.erica.computers_shop.models;

import java.util.List;

public interface Shop {
    String getShopName();
    String getOwner();
    String getId();

    List<ComputerModel> computerList();
    void addComputer(ComputerModel computer);
    boolean deleteComputer(Brand brand, int id);
    ComputerModel searchComputer(Brand brand);
}
