package ru.streamwork.api;

public class Component {
    private final String name;
    private final Stream outgoingStream = new Stream();

    public Component(String name) {
        this.name = name;
    }

    public Stream getOutgoingStream() {
        return outgoingStream;
    }

    public String getName() {
        return name;
    }
}
