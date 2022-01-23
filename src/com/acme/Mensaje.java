package com.acme;

import java.util.Scanner;

public class Mensaje
{


    public String SolicitarDatos(String mensaje)
    {
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        scn.nextLine();
        return scn.nextLine();
    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, Bienvenido a Java \n",nombre);
    }
}

