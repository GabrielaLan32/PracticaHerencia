/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Carlos
 */
public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista está dando un masaje relajante.");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Titulación: " + getTitulacion() + "\n" +
                "Años de experiencia: " + getAniosExperiencia();
    }
}

