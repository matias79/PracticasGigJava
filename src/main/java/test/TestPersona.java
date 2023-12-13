package test;

import models.Persona;

public class
TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setApellido("Jose");
        persona1.setApellido("Imbacuan");
        persona1.setTelefono("3152002485");
        System.out.println("datos: " + persona1.toString());
    }
}
