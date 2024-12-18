/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Ana", "Elejido de Caranqui", "8:00 AM - 5:00 PM");
        persona.asistir();

        Empleado empleado = new Empleado("Michael", "Santa Rosa", "9:00 AM - 6:00 PM", "Carlos");
        empleado.asistir();
        empleado.cobrar();
        
        Estudiante estudiante = new Estudiante("Nahim", "Urcuquí", "1:00 AM - 6:00 PM", 2, 'A');
        estudiante.asistir();
        estudiante.estudiar();

        Administrador admin = new Administrador("María", "Alpachaca", "10:00 AM - 7:00 PM", "Pedro", "Coordinador de Carrera");
        admin.asistir();
        admin.cobrar();
        admin.administrar();

        Profesor profesor = new Profesor("José", "La Victoria", "7:00 AM - 4:00 PM", "Laura", "Desarrollo de Software");
        profesor.asistir();
        profesor.cobrar();
        profesor.enseñar();

        
    }
}

   
