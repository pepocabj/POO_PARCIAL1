public class Delantero extends Jugador{
    public int goles;

    public Delantero(String nombre, int edad, String apellido, String tipo, boolean titular, int goles) {
        super(nombre, edad, apellido, tipo, titular);
        this.goles = goles;
    }


}
