package ru.streamwork.api;

import ru.streamwork.Event;

import java.util.List;

public abstract class Source extends Component {
    public Source(String name) {
        super(name);
    }

    public abstract void getEvents(List<Event> eventCollector);

}
