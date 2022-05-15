package ru.streamwork;

import ru.streamwork.api.Operator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCounter extends Operator {
    private final Map<String, Integer> countMap = new HashMap<>();
    public VehicleCounter(String name) {
        super(name);
    }

    @Override
    public void apply(Event event, List<Event> collector) {
        String vehicle = (String) event.getData();
        Integer count = countMap.getOrDefault(vehicle, 0);
        count += 1;
        countMap.put(vehicle, count);
        System.out.println("VehicleCounter --> " );
        printCountMap();

    }

    private void printCountMap() {
        System.out.println(0);
    }
}
