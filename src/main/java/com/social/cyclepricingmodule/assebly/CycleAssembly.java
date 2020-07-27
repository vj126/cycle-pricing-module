package com.social.cyclepricingmodule.assebly;

import java.util.ArrayList;
import java.util.List;

import com.social.cyclepricingmodule.component.Component;

public class CycleAssembly {
    private String cycleId;
    private List<Component> components = new ArrayList<>();
    

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
    
    public String getCycleId() {
        return cycleId;
    }

    public void setCycleId(String cycleId) {
        this.cycleId = cycleId;
    }

}
