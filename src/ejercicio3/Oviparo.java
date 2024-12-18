/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Oviparo extends Animal {
    private int numeroHuevos;

    public Oviparo() {
    }

    public Oviparo(int id, String nombre, String alimentacion, int numeroHuevos) {
        super(id, nombre, alimentacion);
        this.numeroHuevos = numeroHuevos;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Número de huevos: " + numeroHuevos;
    }
}

