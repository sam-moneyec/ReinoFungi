package pkCultivoHongos;

import pkCultivoHongos.pkHumano.*;
import pkCultivoHongos.pkHongo.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Reino hongos");
        System.out.println("      Grupo: 4");
        System.out.println("      Integrantes:");
        System.out.println("      - Jhoan Patricio Sasnalema De La Cruz");
        System.out.println("      - Mao Rosero");
        System.out.println("==========================================\n\n");

        // Crear personajes
        Jardinero jardinero = new Jardinero("Carlos", "efectivo");
        Micologo micologo = new Micologo("Dra. Valeria", 1234, "Micología aplicada");

        // Crear hongos
        HongoSeta seta = new HongoSeta("Agaricus bisporus", "sexual", "bosque húmedo", false, 5.5, "blanco");
        Moho moho = new Moho("Penicillium chrysogenum", "asexual", "materia orgánica", false, "verde", "algodonosa");
        Levadura levadura = new Levadura("Saccharomyces cerevisiae", "asexual", "ambiente húmedo", false, "alcohólica", true);

        // R01
        System.out.println("\n🔹 R01: El jardinero entrega el hongo al micólogo");
        jardinero.entregarHongo(seta);

        // R02
        System.out.println("\n🔹 R02: El micólogo estudia el hongo");
        micologo.estudiarHongo(seta);

        // R03
        System.out.println("\n🔹 R03: El micólogo explica la información al jardinero");
        micologo.explicarAlJardinero(jardinero, seta);

        // R04
        System.out.println("\n🔹 R04: El jardinero paga por la información");
        jardinero.pagarInformacion(micologo, "transferencia");

        // R05
        System.out.println("\n🔹 R05: El jardinero cultiva el hongo");
        jardinero.cultivarHongo(seta);

        // Acciones adicionales
        System.out.println("\n🔹 Acciones adicionales:");
        moho.descomponer();
        levadura.fermentar();

        System.out.println("\n🔹 Información de los hongos:");
        seta.mostrarInfo();
        moho.mostrarInfo();
        levadura.mostrarInfo();

        System.out.println("\n==========================================");
        System.out.println("     FIN DE LA SIMULACIÓN DEL PROYECTO");
        System.out.println("==========================================");
    }
}