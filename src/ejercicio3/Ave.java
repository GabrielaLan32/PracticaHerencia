/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Ave extends Oviparo {
    private int envergadura;

    public Ave() {
    }

    public Ave(int id, String nombre, String alimentacion, int numeroHuevos, int envergadura) {
        super(id, nombre, alimentacion, numeroHuevos);
        this.envergadura = envergadura;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Envergadura: " + envergadura + " cm";
    }
}
