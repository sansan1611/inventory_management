package com.hanu.ims.model.domain;

import java.util.Objects;

public class OrderLine {
    private String sku;
    private String productName;
    private long listPrice;
    private int quantity;
    private long lineSum;

    public OrderLine(String sku, String productName, long listPrice, int quantity) {
        this.sku = sku;
        this.productName = productName;
        this.listPrice = listPrice;
        this.quantity = quantity;
        this.lineSum = listPrice * quantity;
    }

    public String getSku() {
        return sku;
    }

    public String getProductName() {
        return productName;
    }

    public long getListPrice() {
        return listPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        lineSum = quantity * listPrice;
    }

    public long getLineSum() {
        return lineSum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderLine{");
        sb.append("sku='").append(sku).append('\'');
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", listPrice=").append(listPrice);
        sb.append(", quantity=").append(quantity);
        sb.append(", lineSum=").append(lineSum);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return listPrice == orderLine.listPrice &&
                quantity == orderLine.quantity &&
                lineSum == orderLine.lineSum &&
                Objects.equals(sku, orderLine.sku) &&
                Objects.equals(productName, orderLine.productName);
    }
}
