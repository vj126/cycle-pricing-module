package com.social.cyclepricingmodule.part;

import java.time.LocalDate;

public interface Part {
    
    public String getPartName();
    
    public double calculatePrice();
    
    public int getQuantity();
    
    public String getDateOfPricing();
    
}
