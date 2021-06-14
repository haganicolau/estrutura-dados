package com.estruturadados.tree.Node;

import org.jetbrains.annotations.NotNull;

public class Value<T extends Comparable<T>> implements Comparable<T>  {

    private final T value;

    public Value(T value) {
        this.value = value;
    }

    public T getT() { return value; }

    @Override
    public int compareTo(@NotNull T e) { return getT().compareTo(e); }

    public int compareTo(Value<T> other)
    {
        return getT().compareTo(other.getT());
    }

    public boolean isGreaterThan (Value<T> value) {
        return this.compareTo(value) > 0;
    }

    public boolean isEquals (Value<T> value) {
        return this.compareTo(value) == 0;
    }

    public boolean isSmallerThan (Value<T> value) {
        return this.compareTo(value) < 0;
    }

    public String toString() {
        return this.value.toString();
    }
}

