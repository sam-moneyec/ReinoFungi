package pkCultivoHongos.pkLab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple almacenamiento en memoria de resultados del laboratorio.
 */
public class Datastore {

    public static class ResultRecord {
        public final String hongo;
        public final String resultado;
        public final String investigador;
        public final LocalDateTime fecha;

        public ResultRecord(String hongo, String resultado, String investigador) {
            this.hongo = hongo;
            this.resultado = resultado;
            this.investigador = investigador;
            this.fecha = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "[" + fecha + "] Hongo: " + hongo + " | Resultado: " + resultado + " | Investigador: " + investigador;
        }
    }

    private final List<ResultRecord> records = new ArrayList<>();

    public void saveResult(String hongo, String resultado, String investigador) {
        records.add(new ResultRecord(hongo, resultado, investigador));
    }

    public List<ResultRecord> getAllResults() {
        return new ArrayList<>(records);
    }

    public void printAll() {
        if (records.isEmpty()) {
            System.out.println("No hay resultados registrados aún.");
            return;
        }
        System.out.println("=== Resultados del laboratorio ===");
        for (ResultRecord r : records) {
            System.out.println(r);
        }
    }
}
