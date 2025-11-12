package pkCultivoHongo.pkSerVivo;

public class Reishi extends Hongo {
    private double tamano;
    private String color;

    public Reishi(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, double tamano, String color) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.tamano = tamano;
        this.color = color;
    }

    public void liberarEsporas() {
        System.out.println(nombreCientifico + " libera esporas para reproducirse.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Fungi medicinal: " + nombreCientifico +
                " | Color: " + color +
                " | Tamaño del sombrero: " + tamano + " cm");
    }

    public void examinarPropiedadesMedicinales() {
        System.out.println(nombreCientifico + " tiene propiedades medicinales beneficiosas para la salud.");
    }
}
