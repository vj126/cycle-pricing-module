package com.social.cyclepricingmodule.component.impl;

import java.util.List;

import com.social.cyclepricingmodule.component.Component;
import com.social.cyclepricingmodule.part.Part;

public class HighLevelComponent implements Component {

    private String componentName;
    private String componentType;
    private List<Part> parts;
    double totalComponentPrice = 0;

    public HighLevelComponent() {
    }

    public HighLevelComponent(String componentName, String componentType) {
        super();
        this.componentName = componentName;
        this.componentType = componentType;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public double calculatePrice() {
        totalComponentPrice = 0;
        for (Part part : parts) {
            totalComponentPrice += part.calculatePrice();
        }

        return totalComponentPrice;
    }

    @Override
    public double getPrice() {
        return totalComponentPrice;
    }

}
