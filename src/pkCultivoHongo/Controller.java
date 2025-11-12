package pkCultivoHongo;
import java.util.HashMap;
import pkCultivoHongo.pkBioma.Terreno;
import pkCultivoHongo.pkHumano.Jardinero;
import pkCultivoHongo.pkHumano.Micologo;
import pkCultivoHongo.pkLab.AppLaboratorioFungi;
import pkCultivoHongo.pkSerVivo.Champinion;
import pkCultivoHongo.pkSerVivo.Levadura;
import pkCultivoHongo.pkSerVivo.Reishi;

public class Controller {
    
     Terreno terreno = new Terreno("Húmedo", 22.5, "Sombra parcial", 3);
        Champinion fungi = new Champinion("Agaricus bisporus", "blanco", "lisa", false);
        Jardinero jardinero = new Jardinero("1724238431", "Carlos", "Perez", 35, 5);
        Micologo micologo = new Micologo("0504293321", "Ana", "Lopez", 40, "anaL", "micros3c", "micorrizas");
        AppLaboratorioFungi lab = new AppLaboratorioFungi("1.0", "LabFungi");
        Levadura levadura = new Levadura("Saccharomyces cerevisiae", "asexual", "selva", false,"alcohólica", true);
        Reishi reishi = new Reishi("Ganoderma lucidum", "asexual", "rugosa", false, 10, "rojo brillante");
    //Registrar muestra
    public void registrarMuestra(){
        System.out.println("==========================================================");
        System.out.println("    Escuela Politécnica Nacional");
        System.out.println("    Integrantes: Robayo Morcillo Samuel Esteban\n                 Mao Tsetung Rosero Duran\n                 Ariel Alejandro Soria Yánez");
        System.out.println("    Proyecto: Reino Fungi");
        System.out.println("    Caso de uso: Gestión del cultivo basado en hongos");
        System.out.println("==========================================================\n");
        System.out.println("INICIO DE SIMULACIÓN\n\n");
        System.out.println("Jardinero se presenta:");
        jardinero.presentarse();
        System.out.println("Micólogo se presenta:");
        micologo.presentarse();
        System.out.println("Tipos de Hongos");
        fungi.mostrarInfo();
        levadura.mostrarInfo();
        reishi.mostrarInfo();
        
  System.out.println("\n Registrar muestra");
        if (jardinero.validarCedula()) {
            String registro = jardinero.registrarMuestra(fungi, terreno);
            lab.guardarMuestra(fungi.getNombre(), registro);
        } else {
            System.out.println("El jardinero no está autenticado. Registro fallido.");
        }
      System.out.println("\n Cultivar hongo");
      System.out.println("Iniciando cultivo del hongo: " + fungi.getNombre());
        jardinero.cultivar(fungi, terreno, 12);
        double progreso = jardinero.medirCrecimiento(fungi);
        System.out.println("Progreso del cultivo: " + progreso + "%");
        System.out.println("==========================================");
    }
    //CultivarHongo
    public void cultivarHongo(){
       System.out.println("\nAnalizar muestra");
        String analisis = micologo.analizarMuestra(fungi);
        micologo.registrarResultado(fungi, analisis, lab);
        System.out.println("Análisis registrado: " + analisis);
        System.out.println("==========================================");
    }
    //AnalizarMuestra
    public void analizarMuestra(){
        System.out.println("\n El micólogo está entregando los resultados de cultivo la jardinero para la automatización del cultivo de hongos\n");
        System.out.println("\n El jardinero está automatizando el cultivo de acuerdo a resultados del laboratorio (tipo de hongo: " + fungi.getNombre() + ")\n");
        HashMap<String, Double> parametros = new HashMap<>();
        parametros.put("humedad", 85.0);
        parametros.put("temperatura", 23.0);
        lab.automatizarCultivo(fungi, terreno, parametros);
        System.out.println("Cultivo automatizado con éxito.");
    }
    //AutomatizarCultivo
    public void automatizarCultivo(){
  micologo.describirBioma(fungi, terreno);
    System.out.println("""
El hongo está creciendo en un bioma adecuado gracias al estudio del micólogo.

SIMULACIÓN FINALIZADA""");
    }
    
    
}