/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Persona {
    private String nombre;
    private String domicilio;
    private String horario;

    public Persona() {
    }

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void asistir() {
        System.out.println(getNombre() + " vive en " + getDomicilio() + 
                           " y está asistiendo según su horario que es desde " + getHorario());
    }
}

