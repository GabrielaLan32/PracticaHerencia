/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Lobo extends Canino {
    public Lobo(int id, String nombre, String alimentacion, String habitat, String tipoPelo) {
        super(id, nombre, alimentacion, habitat, tipoPelo);
    }

    public void aullar() {
        System.out.println(getNombre() + " está aullando.");
    }
}
