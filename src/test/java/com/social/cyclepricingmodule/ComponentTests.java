package com.social.cyclepricingmodule;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.social.cyclepricingmodule.component.impl.HighLevelComponent;
import com.social.cyclepricingmodule.part.Part;
import com.social.cyclepricingmodule.part.impl.PartImpl;

public class ComponentTests {
    private static final double DELTA = 1e-15;

    public void validateComponentTest() {
        // TODO Auto-generated method stub
        HighLevelComponent component = new HighLevelComponent();

        PartImpl part1 = new PartImpl();
        part1.setPartName("Tyre");
        part1.setQuantity(2);
        part1.setUnitPrice(200);

        PartImpl part2 = new PartImpl();
        part2.setPartName("Tyre");
        part2.setQuantity(2);
        part2.setUnitPrice(200);

        List<Part> parts = new ArrayList<>();

        component.setComponentName("Tyre");
        component.setParts(parts);

        Assert.assertEquals("Component name", "Tyre", component.getComponentName());
        Assert.assertEquals("Component parts", 2, component.getParts().size());
        Assert.assertEquals("Component size", 2, component.getParts());
        

    }
}
