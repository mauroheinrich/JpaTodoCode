
package com.mauroheinrich.jpaprueba;

import java.util.ArrayList;
import java.util.Date;
import logica.Alumno;
import logica.Controladora;


public class JpaPrueba {
    public static void main(String[] args) {
       Controladora control = new Controladora();
       
    Alumno al2 = new Alumno(23, "Renata", "Heinrich", new Date());
       control.crearAlumno(al2);
       //control.eliminarAlumno(15);
       
       //alu.setApellido("Heinrich");
       //control.editarALumno(alu);
        System.out.println("---------------BUSQUEDA INDIVIDUAL-------------");
        Alumno alu = control.traerAlumno(15);
        System.out.println("El alumno es: "+ alu.toString());
        System.out.println("---------------BUSQUEDA DE TODOS-------------");  
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al:listaAlumnos) {
            System.out.println("El alumno es: "+ al.toString());
        }
        System.out.println("------------------------------------------");  
    }
    
}
