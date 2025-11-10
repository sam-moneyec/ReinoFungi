package pkCultivoHongos.pkBioma;

import pkCultivoHongos.pkHongo.Fungi;

public class PlantaAsociada {
    private String nombrePlanta;
    private Fungi hongoAsociado;
    private String tipoRelacion; // simbiótica, parasitaria, mutualista, etc.
    private boolean mejoraCrecimiento;

    // Constructor
    public PlantaAsociada(String nombrePlanta, Fungi hongoAsociado, String tipoRelacion, boolean mejoraCrecimiento) {
        this.nombrePlanta = nombrePlanta;
        this.hongoAsociado = hongoAsociado;
        this.tipoRelacion = tipoRelacion;
        this.mejoraCrecimiento = mejoraCrecimiento;
    }

    // Método para simular la interacción entre la planta y el hongo
    public void mostrarInteraccion() {
        System.out.println("\n Interacción Planta-Hongo:");
        System.out.println("La planta " + nombrePlanta + " está asociada con el hongo " + hongoAsociado.getNombreCientifico());
        System.out.println("Tipo de relación: " + tipoRelacion);

        if (mejoraCrecimiento) {
            System.out.println(" Esta asociación mejora el crecimiento de la planta.");
        } else {
            System.out.println(" Esta asociación puede afectar negativamente a la planta.");
        }
    }

    // Método adicional para simular el efecto del hongo sobre la planta
    public void aplicarEfecto() {
        if (mejoraCrecimiento) {
            System.out.println(" La planta " + nombrePlanta + " crece más rápido gracias al hongo.");
        } else {
            System.out.println(" La planta " + nombrePlanta + " muestra signos de debilitamiento.");
        }
    }

    // Getters y Setters
    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public Fungi getHongoAsociado() {
        return hongoAsociado;
    }

    public void setHongoAsociado(Fungi hongoAsociado) {
        this.hongoAsociado = hongoAsociado;
    }

    public String getTipoRelacion() {
        return tipoRelacion;
    }

    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    public boolean isMejoraCrecimiento() {
        return mejoraCrecimiento;
    }

    public void setMejoraCrecimiento(boolean mejoraCrecimiento) {
        this.mejoraCrecimiento = mejoraCrecimiento;
    }
}
