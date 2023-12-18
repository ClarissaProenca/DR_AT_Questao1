package org.example;

import junit.framework.TestCase;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora();
        double esperado = 13;

        assertEquals(esperado, calc.Soma(4, 9), 0);
    }

    @Test
    public void testSubt() {
        Calculadora calc = new Calculadora();
        double esperado = -5;

        assertEquals(esperado, calc.Subt(4, 9), 0);
    }
    @Test
    public void testModulo() {
        Calculadora calc = new Calculadora();
        double esperado = 2.2;

        assertEquals(esperado, calc.Modulo(1, 2), 1);
    }
}
