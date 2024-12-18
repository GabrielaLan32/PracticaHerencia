/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Felino extends Mamifero {
    private int velocidadCaza;

    public Felino() {
    }

    public Felino(int id, String nombre, String alimentacion, String habitat, int velocidadCaza) {
        super(id, nombre, alimentacion, habitat);
        this.velocidadCaza = velocidadCaza;
    }

    public int getVelocidadCaza() {
        return velocidadCaza;
    }

    public void setVelocidadCaza(int velocidadCaza) {
        this.velocidadCaza = velocidadCaza;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Velocidad de caza: " + velocidadCaza + " km/h";
    }
}
