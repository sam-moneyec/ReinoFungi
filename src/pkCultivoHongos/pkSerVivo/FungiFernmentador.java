package pkCultivoHongos.pkSerVivo;

public class FungiFernmentador extends Hongo {
    private String tipoFermentacion;
    private boolean seUsaEnAlimentos;

    public FungiFernmentador(String nombreCientifico, String tipoReproduccion, String habitat, boolean esToxico, String tipoFermentacion, boolean seUsaEnAlimentos) {
        super(nombreCientifico, tipoReproduccion, habitat, esToxico);
        this.tipoFermentacion = tipoFermentacion;
        this.seUsaEnAlimentos = seUsaEnAlimentos;
    }

    public void fermentar() {
        System.out.println(nombreCientifico + " realiza fermentación " + tipoFermentacion + ".");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Levadura: " + nombreCientifico + " | Fermentación: " + tipoFermentacion + " | Uso alimentario: " + seUsaEnAlimentos);
    }
}
