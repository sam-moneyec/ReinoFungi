package pkCultivoHongos.pkSerVivo;

public class FungiComestible extends Hongo {
    private String colorColonia;
    private String superficie;

    public FungiComestible(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, String colorColonia, String superficie) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.colorColonia = colorColonia;
        this.superficie = superficie;
    }

    public void descomponer() {
        System.out.println(nombreCientifico + " está descomponiendo materia orgánica.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Fungi comestible: " + nombreCientifico +
                " | Color: " + colorColonia +
                " | Superficie: " + superficie);
    }

    public void cosechar() {
        System.out.println("Cosechando el fungi comestible: " + nombreCientifico);
    }
}
