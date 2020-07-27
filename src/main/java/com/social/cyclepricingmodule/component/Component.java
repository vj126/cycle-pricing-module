package com.social.cyclepricingmodule.component;

import java.util.List;

import com.social.cyclepricingmodule.part.Part;

public interface Component {

    public String getComponentName();
    
    public String getComponentType();

    public List<Part> getParts();
    
    public void setParts(List<Part> parts);

    public double calculatePrice();
    
    public double getPrice();
}
