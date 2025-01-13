
package com.mauroheinrich.jpaprueba;

import java.util.Date;
import logica.Alumno;
import logica.Carrera;
import logica.Controladora;


public class JpaPrueba {
    public static void main(String[] args) {
       Controladora control = new Controladora();
       //Creacion de Carrera
       Carrera carre = new  Carrera(1,"Licenciatura en Informatica");
       //Guardar Carrera en BD
       control.crearCarrera(carre);
       //Creacion del alumno con Carrera
       
    Alumno al = new Alumno(23, "Renata", "Heinrich", new Date(), carre);
       //Gurdar Alumno en BD
       control.crearAlumno(al);
       //Ver resultado
        System.out.println("--------------------------");
        System.out.println("-------------DATOS ALUMNO-------------");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: "+ alu.getNombre()+ " "+ alu.getApellido());
        System.out.println("Cursa la Carrera: "+ alu.getCarre().getNombre());
    }
    
}
