package pkCultivoHongo.pkHumano;

import pkCultivoHongo.pkBioma.Terreno;
import pkCultivoHongo.pkLab.AppLaboratorioFungi;
import pkCultivoHongo.pkSerVivo.Champinion;
import pkCultivoHongo.pkSerVivo.Hongo;

public class Micologo {
    private String nombre;
    private String cedula;
    private String apellido;
    private String especialidad;

    public Micologo(String cedula, String nombre, String apellido, int edad, String login, String password, String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }
public void presentarse() {
        System.out.println(" - Micólogo: " + nombre + " " + apellido + " | Cédula: " + cedula + " | Especialidad: " + especialidad +"\n");
    }
    public String getNombre() { 
        return nombre; 
    }

    public void mostrarInfo() {
        System.out.println(" - Micólogo: " + nombre + " " + apellido + " | Cédula: " + cedula + " | Especialidad: " + especialidad + "\n");
    }

    // Analizar una muestra de hongo y devolver observación
    public String analizarMuestra(Hongo hongo) {
        System.out.println("\nAnalizando muestra de hongo: " + hongo.getNombre());
        String observacion = hongo.isEsToxico()
            ? "Observación: Hongo TÓXICO - no apto para consumo."
            : "Observación: Hongo NO TÓXICO - apto para consumo.";
        System.out.println(observacion);
        return observacion;
    }

    // Registrar resultados en el laboratorio
    public void registrarResultado(Hongo hongo, String resultado, AppLaboratorioFungi lab) {
        System.out.println("\nRegistrando resultado en laboratorio para " + hongo.getNombre() + "...");
        System.out.println("Resultado registrado: " + resultado);
        // Aquí podrías invocar métodos reales del laboratorio para guardar resultados
    }

    public void describirBioma(Champinion hongo, Terreno terreno) {
        System.out.println("\nEl hongo " + hongo.getNombre() + " se encuentra en un bioma con las siguientes características:");
        terreno.mostrarDatos();
    }
}
