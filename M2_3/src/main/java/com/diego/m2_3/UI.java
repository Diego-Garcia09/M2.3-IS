/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.m2_3;

/**
 *
 * @author Diego
 */
public class UI {
    Evidencia[] evidencias;
    Alumno[] alumnos;
    
    public UI()
    {
        evidencias = null;
        alumnos = null;
    }

    public Evidencia[] getEvidencias() {
        return evidencias;
    }

    public void setEvidencias(Evidencia[] evidencias) {
        this.evidencias = evidencias;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
