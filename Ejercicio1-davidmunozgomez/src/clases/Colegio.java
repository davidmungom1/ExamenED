/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 * Esta clase se encarga de crear los ArrayList necesarios para guardar las asignaturas que se cursan en el colegio, los profesores que las impartes y los alumnos que las cursas.
 * Contiene todos los métodos necesarios para la gestión del colegio, como dar de alta a profesores, alumnos y asignaturas...
 * @author David
 */
public class Colegio {
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Persona> personas;
    
    /**
     * Constructor de la clase colegio.
     * Crea dos arrayList para guardar los datos de las asignaturas, profesores y alumnos
     */
    public Colegio() {
        this.asignaturas = new ArrayList();
        this.personas = new ArrayList();
    }
    
    /**
     * Método para guardar todos los datos del colegio (asignaturas, profesores y alumnos) en fichero.
     */
    public void guardarDatos(){
        
    }
    
    /**
     * Método que permite cargar todos los datos del colegio (asignaturas, profesores y alumnos) en fichero.
     */
    public void cargarDatos(){
        
    }
    
    /**
     * Método para listar todos los objetos de tipo Profesor guardados en el ArrayList personas.
     */
    public void listarProfesores(){
        
    }
    
    /**
     * Método para listar todos los objetos de tipo Alumno guardados en el ArrayList personas.
     */
    public void listarAlumnos(){
        
    }
    
    /**
     * Método para crear un objeto de tipo profesor y almacenarlo en el ArrayList personas.
     * @param departamento El parámetro departamento define el departmaneto al que pertenece el profesor
     * @param dni El parámetro dni define el DNI del profesor
     * @param nombre El parámetro nombre define el nombre del profesor
     */
    public void altaProfesor(String departamento, String dni, String nombre){
        
    }
    
    /**
     * Método para crear un objeto de tipo Alumno y almacenarlo en el ArrayList personas.
     * El método no recibe la fecha de alta del alumno, ya que está se definira automáticamente como el día que se está gestionando el alta.
     * @param nacionalidad El parámetro nacionalidad define la nacionalidad del alumno
     * @param dni El parámetro dni define el dni del alumno
     * @param nombre El parámetro nombre define el nombre del alumno
     */
    public void altaAlumno(String nacionalidad, String dni, String nombre){
        
    }
    
    /**
     * Método para crear un objeto de tipo Asignatura y almacenarlos en el ArrayList asignaturas.
     * @param codigo El parámetro codigo define el código de la asignatura
     * @param nombre El parámetro nombre define el nombre de la asignatura
     * @param horasAnuales El parámetro horasAnuales define las horas anuales de la asignatura
     * @param dni El párametro dni permite al programa comprobar si hay algún objeto Profesor con ese DNI, en caso afirmativo, se obtendrá el objeto Profesor necesario para crear el objeto Asignatura
     */
    public void altaAsignatura(int codigo, String nombre, int horasAnuales, String dni){
        
    }
    
    /**
     * Método para matricular un alumnos en una asignatura.
     * El método se encargará de comprobar tanto si el alumno como la asignatura axiste y en caso afirmativo, añade el alumno al ArrayList alumnos del objeto Asignatura.
     * @param codigo El parámetro recibe el codigo de la asignatura necesario para identificar si está existe
     * @param dni  El parámetro dni recibe el dni del alumno necesario para identicar si el alumno existe
     */
    public void matricularAlumno(int codigo, String dni){
        
    }
       
    /**
     * Método para comprobar la cantidad de asignaturas impartidas por un profesor indicando su DNI.
     * @param dni El párametro dni permite al programa comprobar si hay algún objeto Profesor con ese DNI, en caso afirmativo, devolvera el número de asignaturas impartidas.
     * @return El número de asignaturas impartidas por el profesor con DNI indicado.
     */
    public int asignaturasImpartidas(String dni){
        return 0;
    }
    
    /**
     * Método que devuelve la asignatura con más alumnos matriculados.
     * @return Devuelve el objeto de tipo Asignatura en el que más alumnos se hayan matriculado, es decir, en el que el ArrayList alumnos sea más grande.
     */
    public Asignatura masAlumnos(){
        return null;
    }
}
