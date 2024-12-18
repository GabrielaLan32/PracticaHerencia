/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        
        ProductoFresco fresco = new ProductoFresco("2024-12-31", 101, "2023-12-01", "México");
        System.out.println(fresco);

        
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2024-12-15", 102, "2023-11-01", "Ibarra", "ORG-456", 4.0);
        System.out.println(refrigerado);

        
        CongeladoPorAire aire = new CongeladoPorAire("2024-06-30", 103, "2023-06-15", "Chile", -18.0, 78.0, 21.0, 0.03, 0.97);
        System.out.println(aire);
        CongeladoPorAgua agua = new CongeladoPorAgua("2024-07-31", 104, "2023-07-01", "Perú", -20.0, 35.0);
        System.out.println(agua);
        CongeladoPorNitrogeno nitrogeno = new CongeladoPorNitrogeno("2024-08-31", 105, "2023-08-01", "Argentina", -30.0, "Flash Freeze", 60);
        System.out.println(nitrogeno);
        
        
    }
}

