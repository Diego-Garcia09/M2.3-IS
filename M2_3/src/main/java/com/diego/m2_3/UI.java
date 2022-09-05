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
//La clase UI representa la plataforma de donde se recolecta las evidencias,
//donde se califican las evidencias y la lista de alumnos.
public class UI {
    Evidencia[] evidencias; //Arreglo de todas las evidencias a calificar.
    Alumno[] alumnos; //Arreglo de la lista de alumnos.
    //Cosntructor vacio de la clase UI.
    public UI()
    {
        evidencias = null;
        alumnos = null;
    }
//----------------Setters y Getters de la clase----------------------
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
