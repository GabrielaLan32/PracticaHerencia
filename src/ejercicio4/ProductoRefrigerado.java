/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Carlos
 */
public class ProductoRefrigerado extends ProductoFresco {
    private String codigoOrganismo;
    private double temperaturaRecomendada;

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
                               String codigoOrganismo, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Código organismo: " + codigoOrganismo + "\n" +
               "Temperatura recomendada: " + temperaturaRecomendada + " °C";
    }
}
