public class Arquero extends Jugador {
    public int golesRecibidos;

    public Arquero(String nombre, int edad, String apellido, String tipo, boolean titular, int golesRecibidos) {
        super(nombre, edad, apellido, tipo, titular);
        this.golesRecibidos = golesRecibidos;
    }




    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}
