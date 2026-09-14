package arraylist;

import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args) {

        ArrayList<String> partidos = new ArrayList<>();

        // Formato:
        // Equipo local - Equipo visitante - resultado

        partidos.add("Barcelona - Real Madrid - 2-1");
        partidos.add("Real Madrid - Valencia - 1-1");
        partidos.add("Barcelona - Sevilla - 3-0");
        partidos.add("Valencia - Barcelona - 0-2");
        partidos.add("Sevilla - Real Madrid - 2-1");
        partidos.add("Real Madrid - Barcelona - 2-0");

        System.out.println("Partidos:");
        for (String partido : partidos) {
            System.out.println(partido);
        }

        // 1. Mostrar partidos donde ganó el visitante
        System.out.println("\nPartidos donde ganó el visitante:");

        for (String partido : partidos) {

            String[] datos = partido.split(" - ");

            String marcador = datos[2];

            String[] goles = marcador.split("-");

            int golesLocal = Integer.parseInt(goles[0]);
            int golesVisitante = Integer.parseInt(goles[1]);

            if (golesVisitante > golesLocal) {
                System.out.println(partido);
            }
        }

        // 2. Contar las victorias del Barcelona
        int victoriasBarcelona = 0;

        for (String partido : partidos) {

            String[] datos = partido.split(" - ");

            String local = datos[0];
            String visitante = datos[1];

            String[] goles = datos[2].split("-");

            int golesLocal = Integer.parseInt(goles[0]);
            int golesVisitante = Integer.parseInt(goles[1]);

            if (local.equals("Barcelona") && golesLocal > golesVisitante) {
                victoriasBarcelona++;
            }

            if (visitante.equals("Barcelona") && golesVisitante > golesLocal) {
                victoriasBarcelona++;
            }
        }

        System.out.println("\nVictorias del Barcelona: " + victoriasBarcelona);

        // 3. Eliminar los partidos que no terminaron en empate
        for (int i = partidos.size() - 1; i >= 0; i--) {

            String[] datos = partidos.get(i).split(" - ");
            String[] goles = datos[2].split("-");

            int golesLocal = Integer.parseInt(goles[0]);
            int golesVisitante = Integer.parseInt(goles[1]);

            if (golesLocal != golesVisitante) {
                partidos.remove(i);
            }
        }

        System.out.println("\nPartidos que terminaron en empate:");

        for (String partido : partidos) {
            System.out.println(partido);
        }

        // 4. Contar partidos ganados por el equipo local
        int victoriasLocal = 0;

        for (String partido : partidos) {

            String[] datos = partido.split(" - ");
            String[] goles = datos[2].split("-");

            int golesLocal = Integer.parseInt(goles[0]);
            int golesVisitante = Integer.parseInt(goles[1]);

            if (golesLocal > golesVisitante) {
                victoriasLocal++;
            }
        }

        System.out.println("\nPartidos ganados por el equipo local: " + victoriasLocal);
    }
}
