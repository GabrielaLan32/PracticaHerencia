/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Carlos
 */
public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
                            double temperaturaRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno,
                            double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Composición del aire:\n" +
               "   Nitrógeno: " + porcentajeNitrogeno + "%\n" +
               "   Oxígeno: " + porcentajeOxigeno + "%\n" +
               "   Dióxido de carbono: " + porcentajeDioxidoCarbono + "%\n" +
               "   Vapor de agua: " + porcentajeVaporAgua + "%";
    }
}
