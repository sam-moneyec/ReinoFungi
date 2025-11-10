package entidades;

public class HongoSeta extends Fungi {
    private double tamanoSombrero;
    private String color;

    public HongoSeta(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, double tamanoSombrero, String color) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.tamanoSombrero = tamanoSombrero;
        this.color = color;
    }

    public void liberarEsporas() {
        System.out.println(nombreCientifico + " libera esporas para reproducirse.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Hongo Seta: " + nombreCientifico + " (" + color + "), sombrero de " + tamanoSombrero + " cm.");
    }
}
