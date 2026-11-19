package com.bootcamp;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */

/**
 * Suposiciones
 * EL descuento debe ser mayor a 0 y puede variar entre 1 y 99
 * El sistema recibe el valor del producto y el descuento a aplicar
 * El sistema regresa el valor del descuento que se va aplicar
 * 
 * Lista de Escenario
 * 1. El valor del producto es mayor a 0 y el descuento mayor a 0 y menos a 100
 * 2. El valor del producto es mayor a 0 y el descuento de 100 por lo que debe regresar el valor del producto completo
 * 3. El valor del producto es mayor a 0 y el desceutno de 0 porque lo debe de regresar 0
 * 
 */
public class DiscountCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    private static final double DELTA = 0.0001;
    @Test
    public void entregaDescuentodeUnoANoventanueve()
    {
        double valorProducto = 300.0;

        DiscountCalculator discount = new DiscountCalculator(30.0);

        double descuentoCalculado = discount.calculaDescuento(valorProducto);

        assertEquals(90.0, descuentoCalculado, DELTA);
    }

    @Test
    public void regresaDescuentoCompleto()
    {
        double valorProducto = 300.0;

        DiscountCalculator discount = new DiscountCalculator(30.0);

        double descuentoCompleto = discount.descuentoCompleto(valorProducto);

        assertEquals(valorProducto, descuentoCompleto,DELTA);
    }

    @Test
    public void regresaSinDescuento()
    {
        double valorProducto = 300.0;

        DiscountCalculator discount = new DiscountCalculator(0.0);

        double sinDescuento = discount.sinDescuento(valorProducto);

        assertEquals(0, sinDescuento,DELTA);
    }
}