import entidades.*;
import logica.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("      Escuela Politécnica Nacional");
        System.out.println("      Proyecto: Poliretos - Series Numéricas");
        System.out.println("Grupo: 4");
        System.out.println("Integrantes:");
        System.out.println("-Robayo Morcillo Samuel Esteban\n");
        System.out.println("==========================================\n\n\n");





        Micologo micologo = new Micologo("Dr. Fungal", 10);

        Fungi seta = new HongoSeta("Agaricus bisporus", "sexual", "bosque húmedo", false, 5.5, "marrón");
        Fungi levadura = new Levadura("Saccharomyces cerevisiae", "asexual", "ambiente húmedo", false, "alcohólica", true);
        Fungi moho = new Moho("Penicillium", "asexual", "materia orgánica", false, "verde", "frutas");

        AnimalConsumidor ardilla = new AnimalConsumidor("Ardilla", "omnivora", true);
        PlantaAsociada roble = new PlantaAsociada("Roble", "micorrízica");

        Ecosistema ecosistema = new Ecosistema(micologo);
        ecosistema.agregarHongo(seta);
        ecosistema.agregarHongo(levadura);
        ecosistema.agregarHongo(moho);
        ecosistema.agregarAnimal(ardilla);
        ecosistema.agregarPlanta(roble);


        ecosistema.mostrarEcosistema();
        ecosistema.simularInteraccion();
        ardilla.comer(moho);
        ardilla.comer(seta);
        ardilla.mostrarInfo();
        seta.reproducirse();
        levadura.alimentarse();
        roble.formarMicorriza(levadura);
        
    }
}
