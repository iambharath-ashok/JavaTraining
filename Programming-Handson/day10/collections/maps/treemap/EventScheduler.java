package javatraining.day10.collections.maps.treemap;

import java.util.TreeMap;
import java.util.Map;

public class EventScheduler {
    public static void main(String[] args) {
        TreeMap<Long, String> eventSchedule = new TreeMap<>();

        eventSchedule.put(System.currentTimeMillis() + 120000, "Presentation");
        eventSchedule.put(System.currentTimeMillis() + 60000, "Meeting");
        eventSchedule.put(System.currentTimeMillis() + 300000, "Lunch");


        // Display scheduled events
        for (Map.Entry<Long, String> entry : eventSchedule.entrySet()) {
            long timestamp = entry.getKey();
            String event = entry.getValue();
            System.out.println("At " + timestamp + ": " + event);
        }
    }
}
