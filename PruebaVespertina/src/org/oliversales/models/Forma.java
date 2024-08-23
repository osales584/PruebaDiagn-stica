package org.oliversales.models;
// Harlin Palacios
public abstract class Forma {
     
    private String color;
    
    public Forma(String color){
        this.color = color;
    }

    public abstract double calcularArea();

    public void calcularArea(String mensaje){
        System.out.print(mensaje);
        System.out.print("El area de la froma es de:" + calcularArea());
    }
    
    public void calcularArea(double numero){
        System.out.print("El area con el numero multiplicador " + numero + "es: " + (calcularArea() * numero));
    }
    
}
