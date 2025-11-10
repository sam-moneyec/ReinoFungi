package pkCultivoHongos.pkBioma;

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

    public void mostrarInfo() {
        System.out.println("🌱 Terreno tipo: " + tipoSuelo + 
                           " | Temp: " + temperatura + "°C" + 
                           " | Luz: " + luz + 
                           " | Fertilidad: " + fertilidad + "/5");
    }
}