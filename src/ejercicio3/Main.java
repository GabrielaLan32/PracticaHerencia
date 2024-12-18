/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro(1, "Bobby", "Omnívoro", "Hogar", "Corto");
        Lobo lobo1 = new Lobo(2, "Hachiko", "Carnívoro", "Bosque", "Grueso");
        Gato gato1 = new Gato(3, "Mimi", "Omnívoro", "Hogar", 30);

        perro1.ladrar();
        lobo1.aullar();
        gato1.maullar();

        System.out.println(perro1.toString());
        System.out.println(lobo1.toString());
        System.out.println(gato1.toString());

        System.out.println();

        Aguila aguila1 = new Aguila(4, "Fénix", "Carnívoro", 3, 200);
        Paloma paloma1 = new Paloma(5, "Blanca", "Herbívoro", 2, 40);

        aguila1.cazar();
        paloma1.volar();

        System.out.println(aguila1.toString());
        System.out.println(paloma1.toString());

        Trucha trucha1 = new Trucha(6, "Nemo", "Omnívoro", 1000, 50);
        trucha1.nadar();
        System.out.println(trucha1.toString());

        Oviparo oviparo = aguila1; 
        System.out.println("\nUpcasting:\n" + oviparo.toString());

        Aguila aguilaDown = (Aguila) oviparo; 
        aguilaDown.cazar();
        
    }
}

