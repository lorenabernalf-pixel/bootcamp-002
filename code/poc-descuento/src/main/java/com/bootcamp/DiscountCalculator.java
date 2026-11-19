package com.bootcamp;
public class DiscountCalculator {

private double DESCUENTO;

public DiscountCalculator(double DESCUENTO){
    this.DESCUENTO = DESCUENTO;
}

public double calculaDescuento(double price){
    System.out.println(DESCUENTO/100);
    return price * (DESCUENTO/100);
}

public double descuentoCompleto(double price){
    return price;
}

public double sinDescuento(double price){
    return 0.0;
}

}
