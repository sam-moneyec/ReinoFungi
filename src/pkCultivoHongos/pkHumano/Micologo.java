package pkCultivoHongos.pkHumano;

import pkCultivoHongos.pkSerVivo.Hongo;
import pkCultivoHongos.pkBioma.Terreno;

public class Micologo {
    private String nombre;
    private int codigoIdentificacion;
    private String especialidad;

    public Micologo(String nombre, int codigoIdentificacion, String especialidad) {
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void estudiarHongo(Hongo hongo) {
        System.out.println(" El micólogo " + nombre + " está estudiando el hongo: " + hongo.getNombreCientifico());
        if (hongo.isEsToxico()) {
            System.out.println(" Resultado: El hongo es tóxico y no apto para el consumo.");
        } else {
            System.out.println(" Resultado: El hongo es comestible y seguro para el consumo.");
        }
    }

    // NUEVO método: describir el bioma del hongo usando la información del Terreno
    public void describirBioma(Hongo hongo, Terreno terreno) {
        if (hongo == null) {
            System.out.println("No hay hongo para describir.");
            return;
        }
        if (terreno == null) {
            System.out.println("No hay información del terreno disponible.");
            return;
        }

        System.out.println("\n Descripción del bioma para: " + hongo.getNombreCientifico());
        // Ajusta los getters según tu clase Terreno
        System.out.println("- Tipo de suelo esperado por el hongo: " + hongo.getHabitat());
        System.out.println("- Terreno actual: tipo=" + terreno.getTipoSuelo()
                           + ", temp=" + terreno.getTemperatura() + "°C"
                           + ", luz=" + terreno.getLuz()
                           + ", fertilidad=" + terreno.getFertilidad());

        // Simple lógica de compatibilidad (puedes refinarla)
        String suelo = terreno.getTipoSuelo().toLowerCase();
        String habitat = hongo.getHabitat().toLowerCase();
        if (habitat.contains(suelo) || suelo.contains(habitat) || habitat.contains("húmed") && suelo.contains("húmed")) {
            System.out.println(" Compatibilidad: el hongo parece adaptado a este terreno.");
        } else {
            System.out.println(" Compatibilidad: el hongo podría no prosperar en este terreno.");
        }
    }

    public void explicarAlJardinero(Jardinero jardinero, Hongo hongo) {
        System.out.println("\n El micólogo " + nombre + " explica al jardinero " + jardinero.getNombre() + ":");
        System.out.println("El hongo " + hongo.getNombreCientifico() + " pertenece al hábitat " + hongo.getHabitat());
        if (hongo.isEsToxico()) {
            System.out.println(" Este hongo NO es apto para el consumo humano.");
        } else {
            System.out.println(" Este hongo es seguro para el consumo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Micólogo: " + nombre + " | Código: " + codigoIdentificacion + " | Especialidad: " + especialidad);
    }
}
