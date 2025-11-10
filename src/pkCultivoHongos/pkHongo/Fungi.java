package pkCultivoHongos.pkHongo;

public abstract class Fungi {
    protected String nombreCientifico;
    protected String tipoReproduccion;
    protected String habitat;
    protected boolean esToxico;

    // Constructor
    public Fungi(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico) {
        this.nombreCientifico = nombreCientifico;
        this.tipoReproduccion = tipoReproduccion;
        this.habitat = habitat;
        this.esToxico = esToxico;
    }

    // Métodos comunes
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEsToxico() {
        return esToxico;
    }

    // Método que deben implementar las subclases
    public abstract void mostrarInfo();
}