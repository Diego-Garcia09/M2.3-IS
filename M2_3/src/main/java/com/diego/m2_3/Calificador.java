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
public class Calificador {
    Evidencia evidencia;
    int calificacion;
    
    public Calificador()
    {
        evidencia = null;
        calificacion = 100;
    }

    public void calificarAutomatico(Evidencia[] evidencias, String nombreMeta, long tiempo)
    {
        if(System.currentTimeMillis()>=tiempo)
        {
            for(int i = 0; i < evidencias.length; i++)
            {
                if(evidencias[i].getNombre().equalsIgnoreCase(nombreMeta))
                {
                    evidencias[i].setCalificacion(calificacion);
                }
            }
        }
    }
    
    public void calificarAlumno(Evidencia[] evidencias, String nombreMeta, Alumno alumno)
    {
        for(int i = 0; i < evidencias.length; i++)
        {
            if(evidencias[i].getNombre().equalsIgnoreCase(nombreMeta)&&evidencias[i].getDueno().equals(alumno))
            {
                evidencias[i].setCalificacion(calificacion);
            }
        }
    }
    
    public Evidencia getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(Evidencia evidencia) {
        this.evidencia = evidencia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
