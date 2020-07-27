package com.social.cyclepricingmodule;

import java.util.List;

import org.junit.Test;

import com.social.cyclepricingmodule.assebly.CycleAssembly;
import com.social.cyclepricingmodule.manager.CycleManager;
import com.social.cyclepricingmodule.pricingmodule.PricingEngine;

public class PricingEngineTests {

    @Test
    public void priceGenerationTest() throws InterruptedException {

        List<CycleAssembly> thoudanceCycles = DataGenerator.get1000Cycles();
        PricingEngine engine = new PricingEngine();

        CycleManager cycleManager = new CycleManager();
        cycleManager.setAllCycles(thoudanceCycles);
        engine.calulatePrice(cycleManager);

        Thread.sleep(2000);
    }
}
