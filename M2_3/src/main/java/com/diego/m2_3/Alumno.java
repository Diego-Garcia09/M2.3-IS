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
//Clase que representa al alumno que entrega las tareas.
public class Alumno {
    String nombre; //Representa el nombre del alumno.
    String matricula; //Representa la matricula del alumno.
    String correo; //Representa el correo del alumno.
    //Constructor de la clase Alumno
    public Alumno(String nombre, String matricula, String correo)
    {
        this.nombre = nombre;
        this.matricula = matricula;
        this.correo = correo;
    }
//------------------Setters y Getters de los atributos--------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
