/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Carlos
 */
public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("El futbolista jugó un partido excelente.");
    }

    public void entrenar() {
        System.out.println("El futbolista está entrenando intensamente.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Dorsal: " + getDorsal() + "\n" +
                "Demarcación: " + getDemarcacion();
    }
}

