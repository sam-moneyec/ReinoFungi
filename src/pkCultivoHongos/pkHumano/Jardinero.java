package pkCultivoHongos.pkHumano;

import pkCultivoHongos.pkSerVivo.Hongo;
import pkCultivoHongos.pkBioma.Terreno;

public class Jardinero {
    private String cedula;
    private String nombre;

    public Jardinero(String cedula, String nombre, String apellido, int edad, int experiencia) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

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
            System.out.println("➡ El hongo muestra crecimiento visible.");
        }
    }

    // Medir crecimiento
    public double medirCrecimiento(Hongo hongo) {
        System.out.println("Midiendo crecimiento de: " + hongo.getNombre());
        return 50.0; // ejemplo
    }
}
