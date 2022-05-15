package ru.streamwork.api;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Job {
    private final String name;
    private final Set<Source> sourceSet = new HashSet<>();

    public Job(String name) {
        this.name = name;
    }

    public Stream addSource(Source source) {
        if (sourceSet.contains(source)) {
            throw new RuntimeException("Source " + source.getName() + " is added job twice");
        }
        sourceSet.add(source);
        return source.getOutgoingStream();
    }

    public String getName() {
        return name;
    }

    public Collection<Source> getSources() {
        return sourceSet;
    }
}
