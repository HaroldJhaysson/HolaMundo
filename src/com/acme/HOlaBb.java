package com.acme;

public class HOlaBb {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.SolicitarDatos("escribe tu nombre: ");
        msg.saludar(nombre);
    }
}
