/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista(1, "Lionel", "Messi Cuccittini", 37, 10, "Delantero");
        f1.jugarPartido();
        f1.entrenar();
        System.out.println(f1.toString());

        System.out.println();

        Entrenador e1 = new Entrenador(2, "Pep", "Guardiola Sala", 53, "FED-001");
        e1.dirigirPartido();
        e1.dirigirEntrenamiento();
        System.out.println(e1.toString());

        System.out.println();

        Masajista m1 = new Masajista(3, "Juan", "Pérez Torres", 45, "Fisioterapia", 20);
        m1.darMasaje();
        System.out.println(m1.toString());
    }
}
