package pkCultivoHongos.pkHumano;

import pkCultivoHongos.pkHongo.Fungi;
import pkCultivoHongos.pkHumano.Micologo;

public class Jardinero {
    private String nombre;
    private String metodoPago;

    // Constructor
    public Jardinero(String nombre, String metodoPago) {
        this.nombre = nombre;
        this.metodoPago = metodoPago;
    }

    // R01: El jardinero entrega un hongo
    public void entregarHongo(Fungi hongo) {
        System.out.println(" El jardinero " + nombre + " entrega el hongo " + hongo.getNombreCientifico() + " al micólogo.");
    }

    // R04: El jardinero paga por la información
    public void pagarInformacion(Micologo micologo, String metodo) {
        System.out.println(" El jardinero " + nombre + " paga al micólogo " + micologo.getNombre() + " mediante " + metodo + ".");
    }

    // R05: El jardinero cultiva el hongo
    public void cultivarHongo(Fungi hongo) {
        if (!hongo.isEsToxico()) {
            System.out.println(" El jardinero " + nombre + " cultiva el hongo " + hongo.getNombreCientifico() + " para consumo.");
        } else {
            System.out.println(" El hongo " + hongo.getNombreCientifico() + " es tóxico y no se puede cultivar para consumo.");
        }
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}
