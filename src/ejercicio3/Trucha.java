/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Trucha extends Pez {
    public Trucha(int id, String nombre, String alimentacion, int numeroHuevos, int profundidadMaxima) {
        super(id, nombre, alimentacion, numeroHuevos, profundidadMaxima);
    }

    public void nadar() {
        System.out.println(getNombre() + " está nadando.");
    }
}
