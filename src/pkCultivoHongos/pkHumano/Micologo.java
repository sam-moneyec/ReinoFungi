package logica;

import entidades.Fungi;

public class Micologo {
    private String nombre;
    private int experienciaAnios;

    public Micologo(String nombre, int experienciaAnios) {
        this.nombre = nombre;
        this.experienciaAnios = experienciaAnios;
    }

    
    public void estudiarHongo(Fungi hongo) {
        System.out.println(nombre + " estudia el hongo " + hongo.getnombreCientifico());
    }

    public void recolectarMuestra(Fungi hongo) {
        System.out.println(nombre + " recolecta una muestra de " + hongo.getnombreCientifico());
    }

    public void mostrarInfo() {
        System.out.println("Micólogo: " + nombre + " (" + experienciaAnios + " años de experiencia)");
    }
}
