public class Jugador extends Persona{
    public String tipo;
    public boolean titular;

    public Jugador(String nombre, int edad, String apellido, String tipo, boolean titular) {
        super(nombre, edad, apellido);
        this.tipo = tipo;
        this.titular = titular;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    //public abstract void jugar(); // Método abstracto
}
