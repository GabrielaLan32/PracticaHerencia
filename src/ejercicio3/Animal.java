/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Animal {
    private int id;
    private String nombre;
    private String alimentacion;

    public Animal() {
    }

    public Animal(int id, String nombre, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.alimentacion = alimentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void moverse() {
        System.out.println(nombre + " se está moviendo.");
    }

    @Override
    public String toString() {
        return "DATOS DEL ANIMAL\n" +
               "ID: " + id + "\n" +
               "Nombre: " + nombre + "\n" +
               "Alimentación: " + alimentacion;
    }
}

