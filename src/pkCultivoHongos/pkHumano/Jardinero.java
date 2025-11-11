package pkCultivoHongos.pkHumano;

import java.util.Scanner;

/**
 * Clase que representa al Jardinero dentro del ecosistema del Reino Fungi.
 * Su función es cuidar las plantas y mantener condiciones adecuadas para el cultivo.
 * Además, puede recibir consejos o indicaciones del micólogo.
 */
public class Jardinero {

    // ======== Atributo ========
    private String nombre;

    // ======== Constructores ========

    // Constructor por defecto (usado en el flujo principal del sistema)
    public Jardinero() {
        this.nombre = "Juan";
    }

    // Constructor alternativo (permite asignar nombre personalizado)
    public Jardinero(String nombre) {
        this.nombre = nombre;
    }

    // ======== Getter ========

    public String getNombre() {
        return nombre;
    }

    // ======== Nuevo método ========

    /**
     * Recibe un consejo o explicación del micólogo.
     * Este método refuerza la colaboración entre ambos actores.
     */
    public void recibirConsejo(String mensaje) {
        System.out.println(" El jardinero " + nombre + " escucha: \"" + mensaje + "\"");
    }

    // ======== Modo interactivo ========

    /**
     * Simula una sesión interactiva de cuidado de plantas.
     * Este método puede ejecutarse de forma independiente para probar al Jardinero.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Hola, Soy el Jardinero. Vamos a cuidar las plantas hoy.");
        System.out.print("¿Qué planta vas a cuidar? ");
        String planta = sc.nextLine();

        System.out.print("¿Qué tipo de suelo tiene la planta (arenoso, arcilloso, negro, etc.)? ");
        String tipoDeSuelo = sc.nextLine();

        System.out.print("¿Cuánta agua necesita al día (poca, moderada, mucha)? ");
        String cantidadAgua = sc.nextLine();

        System.out.print("¿La temperatura del ambiente es fría, templada o cálida? ");
        String temperatura = sc.nextLine();

        if (temperatura.equalsIgnoreCase("fría")) {
            System.out.println(" Recuerda que las plantas crecen más lento en el frío. Protégelas del viento.");
        } else if (temperatura.equalsIgnoreCase("cálida")) {
            System.out.println(" El calor es bueno, pero asegúrate de que la planta no se seque.");
        } else {
            System.out.println(" Temperatura ideal para el crecimiento.");
        }

        System.out.print("¿Durante cuántos días cuidarás la planta? ");
        int diasDeCuidado = sc.nextInt();

        for (int i = 1; i <= diasDeCuidado; i++) {
            System.out.println("\n Día " + i + ":");
            System.out.println("- Riega la planta con cantidad " + cantidadAgua + ".");
            System.out.println("- Revisa que el suelo " + tipoDeSuelo + " no esté seco.");
            System.out.println("- Observa el crecimiento de la planta " + planta + ".");
        }

        System.out.println("\n ¡Excelente trabajo! La planta " + planta + " ha crecido saludable gracias a tus cuidados.");
        sc.close();
    }
}
