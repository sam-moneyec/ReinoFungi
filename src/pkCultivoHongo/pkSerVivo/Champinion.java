package pkCultivoHongo.pkSerVivo;

public class Champinion extends Hongo {
    private String color;
    private String superficie;

    // Constructor largo ya existente
    public Champinion(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, String color, String superficie) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.color = color;
        this.superficie = superficie;
    }

    // ---- NUEVO CONSTRUCTOR CONVENIENCIA ----
    // usado por el Main simple (asigna valores por defecto a campos faltantes)
    public Champinion(String nombre, String color, String superficie, boolean esToxico) {
        super(nombre, "asexual", "selva", esToxico);
        this.color = color;
        this.superficie = superficie;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Champinion: " + nombreCientifico + " | Color: " + color + " | Superficie: " + superficie);
    }

    public void cosechar() {
        System.out.println("Cosechando el hongo comestible: " + nombreCientifico);
    }
}
