/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Gato extends Felino {
    public Gato(int id, String nombre, String alimentacion, String habitat, int velocidadCaza) {
        super(id, nombre, alimentacion, habitat, velocidadCaza);
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }
}
