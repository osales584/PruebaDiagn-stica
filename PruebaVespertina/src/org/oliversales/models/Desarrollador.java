
package org.oliversales.models;

public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;


    public Desarrollador(String lenguajeProgramacion, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    
    @Override
    public void trabajar() {
        System.out.println( " está programando en un lenguaje de " + lenguajeProgramacion + ".");
    }

    // Sobrecarga del método trabajar
    public void trabajar(String proyecto) {
        System.out.println( " está trabajando en el proyecto de: " + proyecto + " usando " + lenguajeProgramacion + ".");
    }
}
