/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Carlos
 */
public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
                                 double temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Método de congelación: " + metodoCongelacion + "\n" +
               "Tiempo de exposición: " + tiempoExposicion + " segundos";
    }
}
