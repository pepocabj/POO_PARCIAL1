public class Equipo {
    public String nombre;
    public String pais;
    public Tecnico tecnico;
    public Arquero arquero;
    public String defensa;
    public Delantero delantero;
    public Jugador[] jugadores = new Jugador[11];
    private int indice;




    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Equipo(String nombre, String pais, Tecnico tecnico, Arquero arquero, String defensa, Delantero delantero) {
        //Auto llamo al metodo constructor anterior
        this(nombre, pais);
        this.indice = 0;
        this.tecnico = tecnico;
        this.arquero = arquero;
        this.defensa = defensa;
        this.delantero = delantero;
    }

    public void agregarJugador(Jugador jugador) {
        if (indice < jugadores.length) { // Verifica que no exceda el límite
            jugadores[indice] = jugador; // Agrega el jugador
            indice++; // Incrementa el índice
        } else {
            System.out.println("No se pueden agregar más jugadores, el equipo ya está completo.");
        }
    }

    public String conformidad(){
        String res = "";
        for(int i = 0; i < 11; i++){
            res+= jugadores[i].getNombre() + " " + jugadores[i].tipo + "\n";
        }
        return res;
    }


}
