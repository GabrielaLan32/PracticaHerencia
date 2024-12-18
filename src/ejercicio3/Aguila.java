/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Aguila extends Ave {
    public Aguila(int id, String nombre, String alimentacion, int numeroHuevos, int envergadura) {
        super(id, nombre, alimentacion, numeroHuevos, envergadura);
    }

    public void cazar() {
        System.out.println(getNombre() + " está cazando.");
    }
}
