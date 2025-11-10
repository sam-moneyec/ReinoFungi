package pkCultivoHongos;

import pkCultivoHongos.pkHumano.*;
import pkCultivoHongos.pkSerVivo.*;
import pkCultivoHongos.pkBioma.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Reino hongos");
        System.out.println("      Integrantes: \n     Robayo Morcillo Samuel Esteban,\n     Mao Tsetung Rosero Duran,\n     Ariel Alejandro Soria Yánez");
        System.out.println("==========================================\n\n");

        // R01 - Crear un Terreno
        Terreno terreno = new Terreno("Húmedo", 22.5, "Sombra parcial", 3);
        terreno.mostrarInfo();

        // R02 - Crear un Micólogo
        Micologo micologo = new Micologo("Dr. Fernández", 101, "Micorrizas");
        micologo.mostrarInfo();

        // R03 - Crear diferentes hongos
        FungiComestible moho = new FungiComestible("Aspergillus niger", "Asexual", "Suelo húmedo", true, "Negro", "Algodonosa");
        FungiFernmentador levadura = new FungiFernmentador("Saccharomyces cerevisiae", "Asexual", "Ambientes azucarados", false, "alcohólica", true);
        FungiMedicinal seta = new FungiMedicinal("Agaricus bisporus", "Sexual", "Bosques templados", false, 7.5, "blanca");

        // Mostrar información de los hongos
        moho.mostrarInfo();
        levadura.mostrarInfo();
        seta.mostrarInfo();

        // R04 - Crear una planta asociada al moho
        PlantaAsociada plantaAsociada = new PlantaAsociada("Orquídea", moho, "Simbiótica", true);
        plantaAsociada.mostrarInteraccion();
        plantaAsociada.aplicarEfecto();

        // R05 - Micólogo estudia el hongo y explica al jardinero
        Jardinero jardinero = new Jardinero(); // Jardinero sin interacción por teclado (modo automático)
        micologo.estudiarHongo(moho);
        micologo.explicarAlJardinero(jardinero, moho);

        // R06 - Micólogo describe el bioma del hongo según el terreno
        micologo.describirBioma(moho, terreno);

        // Fin del programa
        System.out.println("\nFin de la simulación del Reino Fungi");
    }
}