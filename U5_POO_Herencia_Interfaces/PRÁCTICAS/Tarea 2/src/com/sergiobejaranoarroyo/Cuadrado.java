package com.sergiobejaranoarroyo;

public class Cuadrado extends PoligonoRegular {
    /*****************/
    /** ACTIVIDAD 3 **/
    /*****************/

    public Cuadrado(double lado, Color color) {
        super(lado, color);
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", color=" + color +
                '}';
    }
}