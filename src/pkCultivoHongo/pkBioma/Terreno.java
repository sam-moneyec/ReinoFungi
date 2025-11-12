package pkCultivoHongo.pkBioma;

public class Terreno {
    private String tipoSuelo;
    private double temperatura;
    private String luz;
    private int fertilidad;

    public Terreno(String tipoSuelo, double temperatura, String luz, int fertilidad) {
        this.tipoSuelo = tipoSuelo;
        this.temperatura = temperatura;
        this.luz = luz;
        this.fertilidad = fertilidad;
    }

    // agregamos mostrarDatos() con formato más detallado
    public void mostrarDatos() {
        System.out.println("=== Información del Terreno ===");
        System.out.println("Tipo de suelo: " + tipoSuelo);
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Nivel de luz: " + luz);
        System.out.println("Fertilidad: " + fertilidad + "/5");
    }

    // Getters existentes
    public String getTipoSuelo() { return tipoSuelo; }
    public double getTemperatura() { return temperatura; }
    public String getLuz() { return luz; }
    public int getFertilidad() { return fertilidad; }
}