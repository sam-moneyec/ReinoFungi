package pkCultivoHongo.pkHumano;

import pkCultivoHongo.pkBioma.Terreno;
import pkCultivoHongo.pkSerVivo.Hongo;

public class Jardinero {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private int experiencia;

    public Jardinero(String cedula, String nombre, String apellido, int edad, int experiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.experiencia = experiencia;
    }
    public void presentarse() {
        System.out.println(" - Jardinero: " + nombre + " " + apellido + " | Cédula: " + cedula +" | Edad: " + edad + " | Experiencia: " + experiencia + " años");
    }
    public String getNombre() { 
        return nombre;
     }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    // Validar si puede usar el sistema
    public boolean validarCedula() {
        return cedula != null && !cedula.isEmpty();
    }

    // Caso de uso 1: registrar muestra
    public String registrarMuestra(Hongo hongo, Terreno terreno) {
        String registro = String.format("Muestra -> Hongo: %s | Terreno: %s | Jardinero: %s",
                hongo.getNombre(), terreno.getTipoSuelo(), nombre);
        System.out.println("\n Muestra registrada:\n  - Hongo: " + hongo.getNombre() +
                           "\n  - Terreno: " + terreno.getTipoSuelo() +
                           "\n  - Jardinero: " + nombre);
        return registro;
    }

    // Caso de uso 2: cultivar hongo
    public void cultivar(Hongo hongo, Terreno terreno, int dias) {
        System.out.printf("\nCultivando %s por %d días en terreno %s...\n", hongo.getNombre(), dias, terreno.getTipoSuelo());
        if (dias >= 1) {
            System.out.println("El hongo muestra crecimiento visible.");
        }
    }

    // Medir crecimiento
    public double medirCrecimiento(Hongo hongo) {
        System.out.println("Midiendo crecimiento de: " + hongo.getNombre());
        return 50.0; // ejemplo
    }
}
