/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Mamifero extends Animal {
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int id, String nombre, String alimentacion, String habitat) {
        super(id, nombre, alimentacion);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Hábitat: " + habitat;
    }
}

