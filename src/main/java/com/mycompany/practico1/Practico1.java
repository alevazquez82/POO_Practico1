package com.mycompany.practico1;

import java.util.Scanner;

public class Practico1 {

    /**
     * Esta funcion busca el indice del atleta con el menor tiempo de carrera en un arreglo de atletas.
     *
     * @param atletas  El arreglo de atletas a analizar.
     * @return El indice del atleta con el menor tiempo de carrera.
     */
    public static int indiceAtletaMasVeloz(Atleta atletas[]) {
        double tiempoCarrera;
        int indice = 0;

        tiempoCarrera = atletas[0].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            // Se busca cual es el menor tiempo
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }

        return indice;
    }
        //declarar variables que se utilizaran para almacenar informacion relevante para la competencia
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAtleta, indiceVeloz;
        String nombre;
        double tiempoCarrera;
        int numeroAtletas;

        // Se solicita al usuario la cantidad de atletas a ingresar
        System.out.print("Ingresar la cantidad de atletas: ");
        numeroAtletas = entrada.nextInt();

        // Se crea un arreglo de atletas
        Atleta atletas[] = new Atleta[numeroAtletas];

        // Se solicita al usuario la informacion de cada atleta
        for (int i = 0; i < atletas.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del Atleta " + (i + 1) + ":");
            System.out.print("Introduzca el Numero de Atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el Tiempo de Carrera: ");
            tiempoCarrera = entrada.nextDouble();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        // Se obtiene el indice del atleta mas veloz
        indiceVeloz = indiceAtletaMasVeloz(atletas);

        // Se muestra la informacion del atleta mas veloz
        System.out.println("\nEl atleta mas veloz es: ");
        System.out.println(atletas[indiceVeloz].mostrarDatos());
    }
}