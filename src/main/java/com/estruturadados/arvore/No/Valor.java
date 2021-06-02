package com.estruturadados.arvore.No;

public class Valor<T extends Comparable<T>> implements Comparable<T>  {

    private T valor;

    public Valor(T valor) {
        this.valor = valor;
    }

    public T getT() { return valor; }

    @Override
    public int compareTo(T e) { return getT().compareTo(e); }

    public int compareTo(Valor<T> other)
    {
        return getT().compareTo(other.getT());
    }

    public boolean isGreaterThan (Valor<T> valor) {
        return this.compareTo(valor) > 0;
    }

    public boolean isEquals (Valor<T> valor) {
        return this.compareTo(valor) == 0;
    }

    public boolean isSmallerThan (Valor<T> valor) {
        return this.compareTo(valor) < 0;
    }

    public String toString() {
        return this.valor.toString();
    }
}

