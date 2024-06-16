package com.example;

public class Multiplier implements IMultiplier {
    private IAdder adder;
    private IFlipper flipper;

    public Multiplier(IAdder adder, IFlipper flipper) {
        this.adder = adder;
        this.flipper = flipper;
    }

    public int multiply(int a, int b) {
        if (b < 0) {
            a = flipper.flip(a);
            b = flipper.flip(b);
        }

        int ret = 0;
        for (int i = 0; i < b; i++) {
            ret = adder.add(ret, a);
        }
        return ret;
    }
}
