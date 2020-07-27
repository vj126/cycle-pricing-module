package com.social.cyclepricingmodule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.social.cyclepricingmodule.assebly.CycleAssembly;
import com.social.cyclepricingmodule.component.Component;
import com.social.cyclepricingmodule.component.ComponentFactory;
import com.social.cyclepricingmodule.component.impl.HighLevelComponent;
import com.social.cyclepricingmodule.manager.CycleManager;
import com.social.cyclepricingmodule.part.Part;
import com.social.cyclepricingmodule.part.impl.PartImpl;

public class DataGenerator {

    static Random random = new Random();
    static int minDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
    static int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();

    public static List<CycleAssembly> get1000Cycles() {

        String[] components = { "frame", "handlebar", "seating", "wheels", "chain assembly" };

        // types of component
        String[] framesTypes = { "Steel frame", "Aluminium frame", "Titanium frame" };
        String[] handlebarsTypes = { "Flat handle bar", "Standard handle bar", "Track handle bar" };
        String[] seatingsTypes = { "Pain", "Aero", "Suspension" };
        String[] wheelsTypes = { "Mountain wheels", "Racing wheels" };
        String[] chainAsemblyTypes = { "Chain with gear", "Chain without gear" };

        List<String[]> types = new ArrayList<>();
        types.add(framesTypes);
        types.add(handlebarsTypes);
        types.add(seatingsTypes);
        types.add(wheelsTypes);
        types.add(chainAsemblyTypes);

        //parts of each component
        String[] frames = { "Top Tube", "Bottom Tube", "Seat Tube" };
        String[] handlebars = { "Handle Bar grip", "Shock absorber", "Front Break", "Rear Break" };
        String[] seatings = { "Shell", "Cover", "Rails", "Saddle clamp", "Suspentions" };
        String[] wheels = { "spoke", "rim", "tube", "tire" };
        String[] chainAssembly = { "Chain", "Pedal", "Gear case", "Sprocket" };

        List<String[]> parts = new ArrayList<>();
        parts.add(frames);
        parts.add(handlebars);
        parts.add(seatings);
        parts.add(wheels);
        parts.add(chainAssembly);

        List<CycleAssembly> cycleAssemblies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            cycleAssemblies.add(buildCycleAssembly(i, components, types, parts));

        }

        return cycleAssemblies;
    }

    private static CycleAssembly buildCycleAssembly(int id, String[] components, List<String[]> types,
            List<String[]> parts) {
        CycleAssembly cycleAssembly = new CycleAssembly();

        for (int i = 0; i < components.length; i++) {
            cycleAssembly.setCycleId(Integer.toString(id));
            String componentName = components[i];
            String[] componentTypes = types.get(i);
            String[] componentParts = parts.get(i);

            String componentType = getComponentType(componentTypes);
            Component component = ComponentFactory.getComponent(componentName, componentType);
            List<Part> partsOfComponent = getParts(componentParts);
            component.setParts(partsOfComponent);
            cycleAssembly.addComponent(component);
        }

        return cycleAssembly;
    }

    private static List<Part> getParts(String[] componentParts) {

        List<Part> parts = new ArrayList<>(componentParts.length);

        for (String partName : componentParts) {
            parts.add(buildPart(partName,
                    LocalDate.ofEpochDay(minDay + random.nextInt(maxDay - minDay)).toString(), 1,
                    200 + random.nextInt(15) * 10));
        }
        return parts;
    }

    private static String getComponentType(String[] componentTypes) {
        return componentTypes[random.nextInt(componentTypes.length)];
    }

    private static PartImpl buildPart(String partName, String dateOfPrice, int quantity,
            double untiPrice) {
        PartImpl part = new PartImpl();
        part.setPartName(partName);
        part.setDateOfPricing(dateOfPrice);
        part.setQuantity(quantity);
        part.setUnitPrice(untiPrice);
        return part;
    }
}
