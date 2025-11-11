package pkCultivoHongos.pkSerVivo;

// Hongo hereda de SerVivo, ya que todo hongo es un tipo de ser vivo
public abstract class Hongo extends SerVivo {

    // Atributos comunes de todos los hongos
    protected String nombreCientifico;
    protected String tipoReproduccion;
    protected String habitat;
    protected boolean esToxico;

    // Constructor
    public Hongo(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico) {
        this.nombreCientifico = nombreCientifico;
        this.tipoReproduccion = tipoReproduccion;
        this.habitat = habitat;
        this.esToxico = esToxico;
    }

    // Métodos getters (acceso controlado a los atributos)
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

    // Método abstracto: obliga a las subclases a definir cómo mostrar su información
    public abstract void mostrarInfo();
}