package com.bootcamp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test 

    int returWhenLessCero()
    {
        double valor = -1;

        Calculator calc = new Calculator(16);
        
        double resultado = calc.validaMenor(valor);

        return resultado;

    }

    @Test 

    int returWhenEqualsCero()
    {
        double valor = 0;

        Calculator calc = new Calculator(16);
        
        double resultado = calc.validaEqual(valor);

        return resultado;

    }
}
