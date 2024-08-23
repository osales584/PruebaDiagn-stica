package org.oliversales.models;
// Harlin Palacios

public class Circulo extends Forma{
    private double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
