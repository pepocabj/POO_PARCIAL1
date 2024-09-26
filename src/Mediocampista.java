public class Mediocampista extends Jugador{
    public int cantAsistencias;

    public Mediocampista(String nombre, int edad, String apellido, String tipo, boolean titular, int cantAsistencias) {
        super(nombre, edad, apellido, tipo, titular);
        this.cantAsistencias = cantAsistencias;
    }


}
