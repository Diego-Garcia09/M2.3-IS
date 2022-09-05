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
public class Evidencia {
    int calificacion;
    String nombre;
    File archivo;
    Alumno dueno;
    
    public Evidencia()
    {
        calificacion = 0;
        nombre = "";
        dueno = null;
        archivo = null;
    }

    public Evidencia(int c, String n, File a, Alumno d)
    {
        this.calificacion = c;
        this.nombre = n;
        this.archivo = a;
        this.dueno = d;
    }
    
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
