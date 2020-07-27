package com.social.cyclepricingmodule.part.impl;

import com.social.cyclepricingmodule.part.Part;

public class PartImpl implements Part {

    private String partName;
    private int quantity = 1;
    private String dateOfPricing;
    private double unitPrice;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDateOfPricing() {
        return dateOfPricing;
    }

    public void setDateOfPricing(String dateOfPrice) {
        this.dateOfPricing = dateOfPrice;
    }

    public double calculatePrice() {
        return quantity * getUnitPrice();
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double untiPrice) {
        this.unitPrice = untiPrice;
    }

}
