package ru.streamwork;

public class VehicleEvent extends Event {
    public final String vehicle;


    public VehicleEvent(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getData() {
        return vehicle;
    }
}
