package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    private ISubtrtactor sbtractor;

    @BeforeAll
    public void setUp() {
        IAdder adder = Mockito.mock(IAdder.class);
        IFlipper fliper = Mockito.mock(IFlipper.class);

        Mockito.when(fliper.flip(5)).thenReturn(-5);
        Mockito.when(adder.add(3, -5)).thenReturn(-2);
        sbtractor = new Subtractor(adder, fliper);
    }

    @Test
    public void shouldAnswerWithTrue() {
        // assertTrue(true);
        Assertions.assertEquals(-2, sbtractor.subtract(3, 5));
    }
}
