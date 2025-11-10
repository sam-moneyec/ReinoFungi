package pkCultivoHongos.pkHumano;

import pkCultivoHongos.pkHongo.Fungi;

public class Micologo {
    private String nombre;
    private int codigoIdentificacion;
    private String especialidad;

    // Constructor
    public Micologo(String nombre, int codigoIdentificacion, String especialidad) {
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
        this.especialidad = especialidad;
    }

    // Método R02: Estudiar hongo
    public void estudiarHongo(Fungi hongo) {
        System.out.println(" El micólogo " + nombre + " está estudiando el hongo: " + hongo.getNombreCientifico());
        
        // Simulamos análisis según toxicidad
        if (hongo.isEsToxico()) {
            System.out.println(" Resultado: El hongo es tóxico y no apto para el consumo.");
        } else {
            System.out.println(" Resultado: El hongo es comestible y seguro para el consumo.");
        }
    }

    // Método R03: Explicar información al jardinero
    public void explicarAlJardinero(Jardinero jardinero, Fungi hongo) {
        System.out.println("\n El micólogo " + nombre + " explica al jardinero " + jardinero.getNombre() + ":");
        System.out.println("El hongo " + hongo.getNombreCientifico() + " pertenece al hábitat " + hongo.getHabitat());
        if (hongo.isEsToxico()) {
            System.out.println(" Este hongo NO es apto para el consumo humano.");
        } else {
            System.out.println(" Este hongo es seguro para el consumo.");
        }
    }

    // Getters (por si se necesitan en otras clases)
    public String getNombre() {
        return nombre;
    }

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Mostrar información general del micólogo
    public void mostrarInfo() {
        System.out.println("Micólogo: " + nombre + " | Código: " + codigoIdentificacion + " | Especialidad: " + especialidad);
    }
}
