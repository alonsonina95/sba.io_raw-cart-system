package com.github.perscholas;


public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
	private Integer quantity;
    private Integer availableQuantity;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getItemDesc() {
        return itemDesc;
    }

}
