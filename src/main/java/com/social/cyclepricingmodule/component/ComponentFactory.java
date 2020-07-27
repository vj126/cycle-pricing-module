package com.social.cyclepricingmodule.component;

import com.social.cyclepricingmodule.component.impl.HighLevelComponent;

public class ComponentFactory {
    
    public static Component getComponent(String componentName, String componentType) {
        Component component;
        switch (componentType) {

        default:
            component = new HighLevelComponent(componentName, componentType);
            break;
        }
        return component;
    }
}
