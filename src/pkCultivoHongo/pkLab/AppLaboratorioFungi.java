package pkCultivoHongo.pkLab;

import java.util.HashMap;

import pkCultivoHongo.pkBioma.Terreno;
import pkCultivoHongo.pkSerVivo.Hongo;

public class AppLaboratorioFungi {
    private String version;
    private String nombreSistema;

    public AppLaboratorioFungi(String version, String nombreSistema) {
        this.version = version;
        this.nombreSistema = nombreSistema;
    }

    public void iniciarLaboratorio() {
        System.out.println("Laboratorio " + nombreSistema + " (v" + version + ") iniciado.");
    }

    // Caso de uso 4: ajustar ambiente
    public void ajustarAmbiente(Terreno terreno, Hongo hongo) {
        System.out.println("\nSistema " + nombreSistema + " ejecutando automatización...");
        System.out.println("- Ajustando temperatura y humedad del terreno " + terreno.getTipoSuelo() + "...");
        System.out.println("- Monitoreando crecimiento del hongo " + hongo.getNombre() + "...");
        System.out.println("- Finalizado: ambiente optimizado.");
    }

    // Método para guardar muestras
    public void guardarMuestra(String id, String registro) {
        System.out.println("Guardando muestra con id " + id + ": " + registro);
    }

    // Método para automatizar cultivo
    public void automatizarCultivo(Hongo hongo, Terreno terreno, HashMap<String, Double> parametros) {
        System.out.println("\nAutomatizando cultivo del hongo " + hongo.getNombre() + "...");
        System.out.println("- Ajustando humedad: " + parametros.get("humedad"));
        System.out.println("- Ajustando temperatura: " + parametros.get("temperatura"));
        System.out.println("- Monitoreando crecimiento...");
        System.out.println("- Cultivo automatizado finalizado.");
    }
}
