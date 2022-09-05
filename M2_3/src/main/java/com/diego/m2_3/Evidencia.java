/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.m2_3;

import java.io.File;

/**
 *
 * @author Diego
 */
//Representa una evidencia enviada por el alumno.
public class Evidencia {
    int calificacion; //Representa la calificacion que se le asignara a la evidencia.
    String nombre; //Representa el nombre la evidencia.
    File archivo; //Representa el archivo entregado.
    Alumno dueno; //Representa al dueno original del archivo.
    //Constructor vacio de clase Evidencia.
    public Evidencia()
    {
        calificacion = 0;
        nombre = "";
        dueno = null;
        archivo = null;
    }
    //Constructor de clase Evidencia.
    public Evidencia(int c, String n, File a, Alumno d)
    {
        this.calificacion = c;
        this.nombre = n;
        this.archivo = a;
        this.dueno = d;
    }
    //---------Setters y Getters de los atributos-----------
    public Alumno getDueno() {
        return dueno;
    }

    public void setDueno(Alumno dueno) {
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}
