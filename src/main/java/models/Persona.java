package models;

public class Persona {
    //todo esta persona deve implementar la clase PersonActions
    private String Nombre;
    private String apellido;
    private String telefono;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String telefono) {
        Nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "models.Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
