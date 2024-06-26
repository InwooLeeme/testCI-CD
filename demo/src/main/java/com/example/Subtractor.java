package com.example;

public class Subtractor implements ISubtrtactor {
    private IAdder adder;
    private IFlipper flipper;

    public Subtractor(IAdder adder, IFlipper flipper) {
        this.adder = adder;
        this.flipper = flipper;
    }

    public int subtract(int a, int b) {
        return adder.add(a, flipper.flip(b));
    }
}