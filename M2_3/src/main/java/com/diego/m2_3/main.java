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
        //Se crean nuevas instancias de los objetos.
        UI ui = new UI();
        Calificador calificador = new Calificador();
        Evidencia evidencia = new Evidencia();
        //Se crean diferentes alumnos.
        Alumno alumno1 = new Alumno("Diego Garcia", "1168334", "a1168334@uabc.edu.mx");
        Alumno alumno2 = new Alumno("Andre Villegas", "1168335", "a1168335@uabc.edu.mx");
        //Se crean diferentes metas que pertenecen a diferentes alumnos.
        Evidencia e1 = new Evidencia(0, "Meta 1.1", null, alumno1);
        Evidencia e2 = new Evidencia(0, "Meta 1.1", null, alumno2);
        Evidencia e3 = new Evidencia(0, "Meta 1.2", null, alumno1);
        Evidencia e4 = new Evidencia(0, "Meta 1.2", null, alumno2);
        Evidencia e5 = new Evidencia(0, "Meta 1.3", null, alumno1);
        //Crea la lista de alumnos y la agrega a la UI.
        Alumno[] alumnos = {alumno1, alumno2};
        ui.setAlumnos(alumnos);
        //Crea una lista de las evidencias recolectadas y la agrega a UI.
        Evidencia[] evidencias = {e1, e2, e3, e4, e5};
        ui.setEvidencias(evidencias);
        //Califica al alumno 1 y solo la meta 1.1
        calificador.calificarAlumno(evidencias, "Meta 1.1", alumno1);
        //Califica de manera automatica la meta 1.2 si la fecha se cumple.
        calificador.calificarAutomatico(evidencias, "Meta 1.2", System.currentTimeMillis());
        //Muestra la calificacion de las evidencias calificadas.
        System.out.println(evidencias[0].getCalificacion());
        System.out.println(evidencias[2].getCalificacion());
        System.out.println(evidencias[3].getCalificacion());
    }
}
