package pkCultivoHongos.pkLab;

import pkCultivoHongos.pkHumano.Micologo;
import pkCultivoHongos.pkSerVivo.Hongo;
import pkCultivoHongos.pkBioma.Terreno;

/**
 * Clase que representa el laboratorio y coordina pruebas.
 */
public class AppLaboratorioFungi {

    private final Datastore datastore;
    private Micologo currentMicologo;

    public AppLaboratorioFungi(Datastore datastore) {
        this.datastore = datastore;
    }

    public void iniciarLaboratorio() {
        System.out.println(" Laboratorio de Fungi iniciado.");
    }

    /**
     * Simula el ingreso del micólogo al laboratorio.
     * En esta versión simple solo valida que no sea null.
     */
    public boolean ingresar(Micologo micologo) {
        if (micologo == null) {
            System.out.println("Error: micólogo inválido.");
            return false;
        }
        this.currentMicologo = micologo;
        System.out.println("Micólogo ingresado al laboratorio: " + micologo.getNombre());
        return true;
    }

    /**
     * Estudia el hongo (delegando al micólogo), determina resultado y guarda en datastore.
     * Devuelve true si se registró correctamente.
     */
    public boolean registrarResultado(Hongo hongo, Terreno terreno) {
        if (currentMicologo == null) {
            System.out.println("No hay micólogo activo en el laboratorio.");
            return false;
        }
        if (hongo == null) {
            System.out.println("No se recibió hongo para estudiar.");
            return false;
        }

        // 1) El micólogo realiza el estudio (usar método ya definido en Micologo)
        currentMicologo.estudiarHongo(hongo);

        // 2) El micólogo puede describir el bioma (si implementaste describirBioma)
        try {
            currentMicologo.describirBioma(hongo, terreno); // si no existe, ignora con cast
        } catch (NoSuchMethodError | Exception e) {
            // método no implementado: omitir
        }

        // 3) Determinar resultado simple
        String resultado = hongo.isEsToxico() ? "TÓXICO - no apto para consumo" : "NO TÓXICO - apto para consumo";

        // 4) Guardar en datastore
        datastore.saveResult(hongo.getNombreCientifico(), resultado, currentMicologo.getNombre());

        System.out.println("Resultado registrado: " + resultado);
        return true;
    }

    public Datastore getDatastore() {
        return datastore;
    }
}
