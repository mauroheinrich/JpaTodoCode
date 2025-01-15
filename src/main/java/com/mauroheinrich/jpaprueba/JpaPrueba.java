
package com.mauroheinrich.jpaprueba;

import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.Controladora;
import logica.Materia;


public class JpaPrueba {
    public static void main(String[] args) {
       Controladora control = new Controladora();
       
      
       //Crear lista de materias y agregar
       LinkedList <Materia> listaMaterias = new LinkedList <Materia>();
       
       //Creacion de Carrera con lista de materias
       Carrera carre = new Carrera(31, "Tecnicatura en Programacion", listaMaterias);
       //Guardar Carrera en BD
       control.crearCarrera(carre);
       
       
       
       //Creacion de Materia
       Materia mate1 = new Materia(20,"Introduccion a la Programacion", "Cuatrimestral", carre);
       Materia mate2 = new Materia(25,"Programacion I", "Anual", carre);
       
       //Guardar Materia en BD
       control.crearMateria(mate1);
       control.crearMateria(mate2);
       
       //agregar a la lista las materias
       listaMaterias.add(mate1);
       listaMaterias.add(mate2);
       
       carre.setListaMaterias(listaMaterias);
       control.editarCarrera(carre);
       
       
       //Creacion del alumno con Carrera
       Alumno al = new Alumno(23, "Renata", "Heinrich", new Date(), carre);
       
       //Guardar Alumno en BD
       control.crearAlumno(al);
       
       //Ver resultado
       System.out.println("--------------------------");
       System.out.println("-------------DATOS ALUMNO-------------");
       Alumno alu = control.traerAlumno(23);
       System.out.println("Alumno: "+ alu.getNombre()+ " "+ alu.getApellido());
       System.out.println("Cursa la Carrera: "+ alu.getCarre().getNombre());
       
       // Listar las materias que cursa el alumno
       System.out.println("Cursa las siguientes Materias: ");
       for (Materia materia : alu.getCarre().getListaMaterias()) {
           System.out.println("- " + materia.getNombre());
       }
      
    }
    
}
