package pkCultivoHongos.pkBioma;

/**
 * Clase Terreno
 * Representa el entorno físico donde puede crecer un hongo.
 */
public class Terreno {
    // ===== Atributos del bioma =====
    private String tipoSuelo;      // Ej: "húmedo", "arenoso", "arcilloso"
    private double temperatura;    // Temperatura promedio en °C
    private String luz;            // Ej: "sombra", "media", "plena"
    private int fertilidad;        // Nivel 1-5

    // ===== Constructor =====
    public Terreno(String tipoSuelo, double temperatura, String luz, int fertilidad) {
        this.tipoSuelo = tipoSuelo;
        this.temperatura = temperatura;
        this.luz = luz;
        this.fertilidad = fertilidad;
    }

    // ===== Métodos =====
    /**
     * Muestra la información detallada del terreno.
     */
    public void mostrarInfo() {
        System.out.println("\n=== Información del Terreno ===");
        System.out.println("Tipo de suelo: " + tipoSuelo);
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Nivel de luz: " + luz);
        System.out.println("Fertilidad: " + fertilidad + "/5");
    }

    /**
     * Evalúa si las condiciones del terreno son adecuadas para hongos.
     * Este método no estaba en el UML original, pero se añade de forma opcional
     * para ampliar compatibilidad con Micologo.describirBioma().
     */
    public boolean esAptoParaHongos() {
        boolean tempApta = temperatura >= 10 && temperatura <= 30;
        boolean luzAdecuada = luz.equalsIgnoreCase("sombra") || luz.equalsIgnoreCase("media");
        boolean sueloApto = tipoSuelo.toLowerCase().contains("húmed") || tipoSuelo.equalsIgnoreCase("orgánico");
        boolean fertilidadBuena = fertilidad >= 3;

        return tempApta && luzAdecuada && sueloApto && fertilidadBuena;
    }

    // ===== Getters =====
    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getLuz() {
        return luz;
    }

    public int getFertilidad() {
        return fertilidad;
    }
}