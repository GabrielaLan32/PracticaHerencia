/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Pez extends Oviparo {
    private int profundidadMaxima;

    public Pez() {
    }

    public Pez(int id, String nombre, String alimentacion, int numeroHuevos, int profundidadMaxima) {
        super(id, nombre, alimentacion, numeroHuevos);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Profundidad máxima: " + profundidadMaxima + " metros";
    }
}
