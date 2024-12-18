/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Carlos
 */
public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("El entrenador dirigió el partido muy bien.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirigió el entrenamiento con precisión.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "ID Federación: " + getIdFederacion();
    }
}

