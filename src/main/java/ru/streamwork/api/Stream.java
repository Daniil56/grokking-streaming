package ru.streamwork.api;

import java.util.HashSet;
import java.util.Set;

public class Stream {
    private final Set<Operator> operators = new HashSet<>();

    public Stream applyOperator(Operator operator) {
        if (operators.contains(operator)) {
            throw new RuntimeException("Operator " + operator.getName() + " is added job twice");
        }
        operators.add(operator);
        return operator.getOutgoingStream();
    }
}
