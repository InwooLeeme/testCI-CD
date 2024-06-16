package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;

public class MultiplierTest {
    private IMultiplier multiplier;

    @BeforeAll
    public void Setting() {
        IAdder adder = Mockito.mock(IAdder.class);
        IFlipper flipper = Mockito.mock(IFlipper.class);

        Mockito.when(flipper.flip(-2)).thenReturn(2);
        Mockito.when(flipper.flip(3)).thenReturn(-3);
        Mockito.when(adder.add(0, 3)).thenReturn(3);
        Mockito.when(adder.add(3, 3)).thenReturn(6);
        Mockito.when(adder.add(0, -3)).thenReturn(-3);
        Mockito.when(adder.add(-3, -3)).thenReturn(-6);

        multiplier = new Multiplier(adder, flipper);
    }

    @Test
    public void multiplyTest() {
        Assertions.assertEquals(6, multiplier.multiply(3, 2));
    }

    @Test
    public void multiplyTest2() {
        Assertions.assertEquals(-6, multiplier.multiply(3, -2));
    }
}
