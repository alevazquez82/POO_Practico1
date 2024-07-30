
package com.mycompany.practico1;
public class Atleta {
  private int numeroAtleta;
  private String nombre;
  private double tiempoCarrera;
  
  //Constructor
  public Atleta(int numeroAtleta, String nombre, double tiempoCarrera) {
    this.numeroAtleta = numeroAtleta;
    this.nombre = nombre;
    this.tiempoCarrera = tiempoCarrera;
  }

  // Getter para los atributos
      public double getTiempoCarrera() {
        return tiempoCarrera;
    }
          public String mostrarDatos(){
        return "Numero: "+numeroAtleta+"\nNombre: "+nombre+"\nTiempoCarrera: "+tiempoCarrera+"\n";
    }
    
}

