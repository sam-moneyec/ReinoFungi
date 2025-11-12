package pkCultivoHongos.pkSerVivo;

public abstract class Hongo extends SerVivo {
    protected String nombreCientifico;
    protected String tipoReproduccion;
    protected String habitat;
    protected boolean esToxico;

    // Constructor existente
    public Hongo(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico) {
        this.nombreCientifico = nombreCientifico;
        this.tipoReproduccion = tipoReproduccion;
        this.habitat = habitat;
        this.esToxico = esToxico;
    }

    // Getters existentes...
    public String getNombreCientifico() { return nombreCientifico; }
    public String getTipoReproduccion() { return tipoReproduccion; }
    public String getHabitat() { return habitat; }
    public boolean isEsToxico() { return esToxico; }

    // ---- NUEVOS MÉTODOS ----
    // Conveniencia: nombre general para impresión (puedes cambiar a nombreComun si lo agregas)
    public String getNombre() {
        return nombreCientifico;
    }

    // Conveniencia: ¿apto para consumo?
    public boolean poderConsumo() {
        return !esToxico;
    }

    // Método abstracto que ya tenías
    public abstract void mostrarInfo();
}