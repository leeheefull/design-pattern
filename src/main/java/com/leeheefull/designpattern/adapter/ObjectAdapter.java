package com.leeheefull.designpattern.adapter;

public class ObjectAdapter implements Target {
    private final Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
