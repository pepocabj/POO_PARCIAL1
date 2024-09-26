public class Tecnico  extends Persona{
    public int añosExp;
    public boolean nacionalidad;

    public Tecnico(String nombre, int edad, String apellido, int añosExp, boolean nacionalidad) {
        super(nombre, edad, apellido);
        this.añosExp = añosExp;
        this.nacionalidad = nacionalidad;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public boolean isNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(boolean nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
