package com.social.cyclepricingmodule.manager;

import java.util.ArrayList;
import java.util.List;

import com.social.cyclepricingmodule.assebly.CycleAssembly;

public class CycleManager {
    private List<CycleAssembly> allCycles = new ArrayList<>();

    public List<CycleAssembly> getAllCycles() {
        return allCycles;
    }

    public void setAllCycles(List<CycleAssembly> allCycle) {
        this.allCycles = allCycle;
    }

    public void addCycle(CycleAssembly cycle) {
        this.allCycles.add(cycle);
    }

}
