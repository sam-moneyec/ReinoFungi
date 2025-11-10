package pkCultivoHongos.pkHongo;

public class Moho extends Fungi {
    private String colorColonia;
    private String superficie;

    public Moho(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, String colorColonia, String superficie) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.colorColonia = colorColonia;
        this.superficie = superficie;
    }

    public void descomponer() {
        System.out.println(nombreCientifico + " está descomponiendo materia orgánica.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moho: " + nombreCientifico + " | Color: " + colorColonia + " | Superficie: " + superficie);
    }
}
