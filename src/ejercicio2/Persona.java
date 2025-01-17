/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Carlos
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println("La persona se está concentrando en sus actividades.");
    }

    public void viajar() {
        System.out.println("La persona está viajando.");
    }

    @Override
    public String toString() {
        return "DATOS DE LA PERSONA\n" +
                "ID: " + getId() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Apellidos: " + getApellidos() + "\n" +
                "Edad: " + getEdad();
    }
}

