package ru.streamwork.api;

import ru.streamwork.Event;

import java.util.List;

public abstract class Operator extends Component {

    public Operator(String name) {
        super(name);
    }

    public abstract void apply(Event event, List<Event> collector);

}
