/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Administrador extends Empleado {
    private String puesto;

    public Administrador() {
    }

    public Administrador(String nombre, String domicilio, String horario, String jefe, String puesto) {
        super(nombre, domicilio, horario, jefe);
        this.puesto = puesto;
    }

        public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void administrar() {
        System.out.println(getNombre() + " está administrando en el puesto de " + getPuesto());
    }

}

