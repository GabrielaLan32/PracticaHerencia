/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Carlos
 */
public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
                            double temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Salinidad del agua: " + salinidadAgua + " g/L";
    }
}
