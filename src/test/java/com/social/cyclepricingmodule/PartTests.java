package com.social.cyclepricingmodule;

import org.junit.Assert;
import org.junit.Test;

import com.social.cyclepricingmodule.part.impl.PartImpl;

public class PartTests {
    private static final double DELTA = 1e-15;

    @Test
    public void validatePartTest() {
        // TODO Auto-generated method stub
        PartImpl part = new PartImpl();
        part.setPartName("Tyre");
        part.setQuantity(2);
        part.setUnitPrice(200);

        Assert.assertEquals("Part name", "Tyre", part.getPartName());
        Assert.assertEquals("Part quantity", 2, part.getQuantity());
        Assert.assertEquals("Part unit price", 200, part.getUnitPrice(), DELTA);
        Assert.assertEquals("Part calculated price", 400, part.calculatePrice(), DELTA);

    }
}
