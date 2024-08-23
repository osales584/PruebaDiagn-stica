
package org.oliversales.models;

public class Tester extends Empleado{
    private String tipoPruebas;

    public Tester(String tipoPruebas, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }
    
    @Override
    public void trabajar() {
        System.out.println( " está realizando tipo de pruebas: " + tipoPruebas);
    }

    // Sobrecarga del método trabajar
    public void trabajar(String herramienta, String proyecto) {
        System.out.println( " está probando el proyecto: " + proyecto + " usando la herramienta de: " + herramienta );
    }
}
