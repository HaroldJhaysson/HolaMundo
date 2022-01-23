package com.acme;

public class HOlaBb {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.SolicitarDatos("escribe tu nombre: ");
        String apellido = msg.SolicitarDatos("escribe tu apellido: ");
        Persona p1 = new Persona(nombre,apellido);
        msg.saludar(p1);



    }

}
