package pkCultivoHongos.pkHumano;

import java.util.Scanner;

public class Jardinero {
    private String nombre;

    // 🔹 Constructor vacío (necesario para usarlo desde Main)
    public Jardinero() {
        this.nombre = "Jardinero desconocido";
    }

    // 🔹 Constructor con nombre (opcional, por si quieres personalizarlo)
    public Jardinero(String nombre) {
        this.nombre = nombre;
    }

    // 🔹 Getter para que el micólogo pueda acceder al nombre
    public String getNombre() {
        return nombre;
    }

    // 🔹 Método interactivo (tu versión original, la mantenemos intacta)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String planta, tipoDeSuelo, cantidadAgua, temperatura;
        int diasDeCuidado;

        System.out.println(" ¡Hola! Soy el Jardinero. Vamos a cuidar las plantas hoy.");
        System.out.print("¿Qué planta vas a cuidar? ");
        planta = sc.nextLine();

        System.out.print("¿Qué tipo de suelo tiene la planta (arenoso, arcilloso, negro, etc.)? ");
        tipoDeSuelo = sc.nextLine();

        System.out.print("¿Cuánta agua necesita al día (poca, moderada, mucha)? ");
        cantidadAgua = sc.nextLine();

        System.out.print("¿La temperatura del ambiente es fría, templada o cálida? ");
        temperatura = sc.nextLine();

        if (temperatura.equalsIgnoreCase("fría")) {
            System.out.println("Recuerda que las plantas crecen más lento en el frío. Protégelas del viento.");
        } else if (temperatura.equalsIgnoreCase("cálida")) {
            System.out.println("El calor es bueno, pero asegúrate de que la planta no se seque.");
        } else {
            System.out.println("Temperatura ideal para el crecimiento.");
        }

        System.out.print("¿Durante cuántos días cuidarás la planta? ");
        diasDeCuidado = sc.nextInt();

        for (int i = 1; i <= diasDeCuidado; i++) {
            System.out.println("\nDía " + i + ":");
            System.out.println("- Riega la planta con cantidad " + cantidadAgua + ".");
            System.out.println("- Revisa que el suelo " + tipoDeSuelo + " no esté seco.");
            System.out.println("- Observa el crecimiento de la planta " + planta + ".");
        }

        System.out.println("\n ¡Excelente trabajo! La planta " + planta + " ha crecido saludable gracias a tus cuidados.");

        sc.close();
    }
}
