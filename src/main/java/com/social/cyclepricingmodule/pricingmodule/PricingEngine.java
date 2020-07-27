package com.social.cyclepricingmodule.pricingmodule;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.social.cyclepricingmodule.assebly.CycleAssembly;
import com.social.cyclepricingmodule.component.Component;
import com.social.cyclepricingmodule.manager.CycleManager;

public class PricingEngine {

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void calulatePrice(CycleManager cycleManager) {

        List<CycleAssembly> allCycle = cycleManager.getAllCycles();

        for (CycleAssembly cycle : allCycle) {
            executorService.execute(new Task(cycle));
        }
        
        executorService.shutdown();
    }

    public static class Task implements Runnable {

        private CycleAssembly cycle;

        public Task(CycleAssembly cycle) {
            this.cycle = cycle;
        }

        @Override
        public void run() {
            double totalPrice = 0;
            StringBuilder builder = new StringBuilder();
            for (Component component : cycle.getComponents()) {
                builder.append(component.getComponentName());
                double componentPrice = component.calculatePrice();
                builder.append(" : " ).append(componentPrice).append(" ");
                totalPrice += componentPrice;
            }
            System.out.println("CycleId: "+cycle.getCycleId()+ " Total price: "+totalPrice + " component price [ "+ builder.toString()+"]");
        }

    }

}
