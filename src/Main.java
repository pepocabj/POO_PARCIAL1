public class Main {
    public static void main(String[] args) {
        // Crear dos equipos
        Equipo equipo1 = new Equipo("Los Tigres", "México");
        Equipo equipo2 = new Equipo("Las Águilas", "Colombia");


        // Agregar 11 jugadores al equipo 2
        Arquero a1 = new Arquero("David", 32, "Lopez", "Arquero", true, 3);
        Delantero d1 = new Delantero("Antonio", 26, "Martínez", "Delantero", true,1);
        Defensa o4 = new Defensa("Gabriel", 29, "González", "Defensa", true);
        Defensa o5 = new Defensa("Fernando", 27, "Santos", "Defensa", true);
        Delantero d4 = new Delantero("Manuel", 24, "Moreno", "Delantero", true,4);
        Delantero d3 = new Delantero("Héctor", 25, "Salazar", "Delantero", true,4);
        Defensa o2 = new Defensa("Nicolás", 30, "Córdoba", "Defensa", true);
        Defensa o3 = new Defensa("Julián", 28, "Castillo", "Defensa", true);
        Delantero d2 = new Delantero("Rodrigo", 22, "Paz", "Delantero", true,16);
        Delantero d5 = new Delantero("José", 23, "Acosta", "Delantero", true,40);
        Defensa o1 = new Defensa("Ignacio", 31, "Vega", "Defensa", true);

        equipo1.agregarJugador(a1);
        equipo1.agregarJugador(d1);
        equipo1.agregarJugador(d2);
        equipo1.agregarJugador(d3);
        equipo1.agregarJugador(d4);
        equipo1.agregarJugador(d5);
        equipo1.agregarJugador(o1);
        equipo1.agregarJugador(o2);
        equipo1.agregarJugador(o3);
        equipo1.agregarJugador(o4);
        equipo1.agregarJugador(o5);
        System.out.println(equipo1.conformidad());


    }
}