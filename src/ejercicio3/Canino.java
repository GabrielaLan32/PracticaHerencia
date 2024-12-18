/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Carlos
 */
public class Canino extends Mamifero {
    private String tipoPelo;

    public Canino() {
    }

    public Canino(int id, String nombre, String alimentacion, String habitat, String tipoPelo) {
        super(id, nombre, alimentacion, habitat);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Tipo de pelo: " + tipoPelo;
    }
}
