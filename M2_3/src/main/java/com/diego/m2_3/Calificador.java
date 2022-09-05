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
//Clase que realiza la calificacion de evidencias.
public class Calificador {
    Evidencia evidencia;
    int calificacion;
    //Constructor vacio de la clase Calificador.
    public Calificador()
    {
        evidencia = null;
        calificacion = 100;
    }
//Realiza la calificacion de evidencias de manera automatica, necesita recibir
//la lista que tenga todas las evidencias, el nombre de la meta a calificar
//y una fecha en la cual calificar automaticamente.
    public void calificarAutomatico(Evidencia[] evidencias, String nombreMeta, long tiempo)
    {
        //Si el tiempo actual es mayor o igual a la fecha de calificacion, se
        //realiza el proceso de calificacion.
        if(System.currentTimeMillis()>=tiempo)
        {
            //Recorre toda la lista de evidencias.
            for(int i = 0; i < evidencias.length; i++)
            {
                //Califica todas las evidencias que tengan el mismo nombre
                //que el eespecificado.
                if(evidencias[i].getNombre().equalsIgnoreCase(nombreMeta))
                {
                    evidencias[i].setCalificacion(calificacion);
                }
            }
        }
    }
//Califica a un alumno especifico de manera individual, necesita recibit el
//nombre del alumno y de la meta, asi como tambien la lista de las evidencias.
    public void calificarAlumno(Evidencia[] evidencias, String nombreMeta, Alumno alumno)
    {
        //Recorre toda la lista.
        for(int i = 0; i < evidencias.length; i++)
        {
            //Si la evidencia en la lista tiene el mismo nombre que la evidencia
            //a calificar y le pertenece al alumno, realiza la calificacion.
            if(evidencias[i].getNombre().equalsIgnoreCase(nombreMeta)&&evidencias[i].getDueno().equals(alumno))
            {
                evidencias[i].setCalificacion(calificacion);
            }
        }
    }
    //----------Setters y Getters de los atributos--------------------
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
