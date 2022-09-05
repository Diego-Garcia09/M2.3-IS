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
public class main {
    public static void main(String[] args)
    {
        UI ui = new UI();
        Calificador calificador = new Calificador();
        Evidencia evidencia = new Evidencia();
        
        Alumno alumno1 = new Alumno("Diego Garcia", "1168334", "a1168334@uabc.edu.mx");
        Alumno alumno2 = new Alumno("Andre Villegas", "1168335", "a1168335@uabc.edu.mx");
        
        Evidencia e1 = new Evidencia(0, "Meta 1.1", null, alumno1);
        Evidencia e2 = new Evidencia(0, "Meta 1.1", null, alumno2);
        Evidencia e3 = new Evidencia(0, "Meta 1.2", null, alumno1);
        Evidencia e4 = new Evidencia(0, "Meta 1.2", null, alumno2);
        Evidencia e5 = new Evidencia(0, "Meta 1.3", null, alumno1);
        
        Alumno[] alumnos = {alumno1, alumno2};
        ui.setAlumnos(alumnos);
        
        Evidencia[] evidencias = {e1, e2, e3, e4, e5};
        ui.setEvidencias(evidencias);
        
        calificador.calificarAlumno(evidencias, "Meta 1.1", alumno1);
        calificador.calificarAutomatico(evidencias, "Meta 1.2", System.currentTimeMillis());
        System.out.println(evidencias[0].getCalificacion());
        System.out.println(evidencias[2].getCalificacion());
        System.out.println(evidencias[3].getCalificacion());
    }
}
