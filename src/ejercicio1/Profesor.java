/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Profesor extends Empleado {
    private String carrera;

    public Profesor(String nombre, String domicilio, String horario, String jefe, String carrera) {
        super(nombre, domicilio, horario, jefe);
        this.carrera = carrera;
    }

    public void enseñar() {
        System.out.println(getNombre() + " está enseñando la carrera de " + getCarrera());
    }

    // Getter y Setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
