/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Empleado extends Persona {
    private String jefe;

    public Empleado() {
    }

    public Empleado(String nombre, String domicilio, String horario, String jefe) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public void cobrar() {
        System.out.println(getNombre() + " vive en " + getDomicilio() + 
                           " y está cobrando bajo la supervisión de " + getJefe());
    }
}


