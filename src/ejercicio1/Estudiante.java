/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Estudiante extends Persona {
    private int grado;
    private char grupo;

    // Constructor vacío
    public Estudiante() {
    }

    public Estudiante(String nombre, String domicilio, String horario, int grado, char grupo) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public void estudiar() {
        System.out.println(getNombre() + " vive en " + getDomicilio() + 
                           " y está estudiando en el grado " + getGrado() + 
                           " grupo " + getGrupo());
    }
}
