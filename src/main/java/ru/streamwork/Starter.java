package ru.streamwork;

import ru.streamwork.api.Job;
import ru.streamwork.api.Stream;
import ru.streamwork.engine.JobStarter;

public class Starter {
    public static void main(String[] args) {
        Job job  = new Job("first");
        Stream bridgeOut = job.addSource(new SensorReader("test", 8080));
        bridgeOut.applyOperator(new VehicleCounter("car"));
        JobStarter starter = new JobStarter(job);
        starter.start();
    }
}
