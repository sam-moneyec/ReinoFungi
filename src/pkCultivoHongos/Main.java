package pkCultivoHongos;
import pkCultivoHongos.pkHumano.Jardinero;
import pkCultivoHongos.pkLab.AppLaboratorioFungi;
import pkCultivoHongos.pkHumano.Micologo;
import pkCultivoHongos.pkSerVivo.FungiComestible;
import pkCultivoHongos.pkBioma.Terreno;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    Escuela Politécnica Nacional");
        System.out.println("    Integrantes: Robayo Morcillo Samuel Esteban, Mao Tsetung Rosero Duran, Ariel Alejandro Soria Yánez");
        System.out.println("    Proyecto: Reino Fungi");
        System.out.println("    Caso de uso: Gestión del cultivo basado en hongos");
        System.out.println("==========================================\n");

        // Crear entidades
        Terreno terreno = new Terreno("Húmedo", 22.5, "Sombra parcial", 3);
        FungiComestible fungi = new FungiComestible("Agaricus bisporus", "blanco", "lisa", false);
        Jardinero jardinero = new Jardinero("0101", "Carlos", "Perez", 35, 5);
        Micologo micologo = new Micologo("0202", "Ana", "Lopez", 40, "anaL", "micros3c", "micorrizas");
      
        AppLaboratorioFungi lab = new AppLaboratorioFungi("1.0", "LabFungi");
        lab.iniciarLaboratorio();

        // === Caso de Uso 1: Registrar muestra ===
        System.out.println("\n[USE CASE 1: Registrar muestra]");
        if (jardinero.validarCedula()) {
            String registro = jardinero.registrarMuestra(fungi, terreno);
            lab.guardarMuestra(fungi.getNombre(), registro);
        } else {
            System.out.println("El jardinero no está autenticado. Registro fallido.");
        }

        // === Caso de Uso 2: Cultivar hongo ===
        System.out.println("\n[USE CASE 2: Cultivar hongo]");
        jardinero.cultivar(fungi, terreno, 12);
        double progreso = jardinero.medirCrecimiento(fungi);
        System.out.println("Progreso del cultivo: " + progreso + "%");

        // === Caso de Uso 3: Analizar muestra ===
        System.out.println("\n[USE CASE 3: Analizar muestra]");
        String analisis = micologo.analizarMuestra(fungi);
        micologo.registrarResultado(fungi, analisis, lab);

        // === Caso de Uso 4: Automatizar cultivo ===
        System.out.println("\n[USE CASE 4: Automatizar cultivo]");
        HashMap<String, Double> parametros = new HashMap<>();
        parametros.put("humedad", 85.0);
        parametros.put("temperatura", 23.0);
        lab.automatizarCultivo(fungi, terreno, parametros);

        // === Describir bioma ===
        micologo.describirBioma(fungi, terreno);

        System.out.println("\n==========================================");
        System.out.println("     Fin de la simulación de casos de uso");
        System.out.println("==========================================");
    }
}