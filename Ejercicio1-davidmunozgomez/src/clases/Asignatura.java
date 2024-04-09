/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 * Esta clase define un objeto asignatura con todos los atributos necesarios para definirla.
 * @author David
 * @since 09/04/2024
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private int horasAnuales;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    /**
     * Constructor para un objeto asignatura
     * @param codigo Código de la asignatura, se obtará por un codigo numero que empiece por 001 y vaya incrementando con cada asignatura diferente
     * @param nombre Nombre de la asignatura
     * @param horasAnuales Horas anuales que se imparten de la asignatura
     * @param profesor Objeto de tipo Profesor que impartirá la asignatura
     * @param alumnos Listado de los alumnos matriculados en la asignatura
     */
    public Asignatura(int codigo, String nombre, int horasAnuales, Profesor profesor, ArrayList<Alumno> alumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasAnuales = horasAnuales;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }
    
    /**
     * Método getter para el código de la asignatura
     * @return codigo Devuelve el código de la asignatura
     */
    public int getCodigo() {
        return codigo;
    }
    
    /**
     * Método setter para el código de la asignatura
     * @param codigo Recibe un int con el código de la asignatura
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Método getter para el nombre de la asignatura
     * @return nombre Devuelve el nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método setter para el nombre
     * @param nombre Recibe el nombre a establecer en el objeto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método getter para las horas anuales de la asignatura
     * @return horasAnuales Devuelve un int con las horas anuales que se imparten de la asignatura
     */
    public int getHorasAnuales() {
        return horasAnuales;
    }
    
    /**
     * Método setter para las horas anuales
     * @param horasAnuales Recibe un int con las horas anuales a establecer en la asignatura
     */
    public void setHorasAnuales(int horasAnuales) {
        this.horasAnuales = horasAnuales;
    }
    
    /**
     * Método getter para el profesor de la asignatura
     * @return profesor Devuelve un objeto de tipo Profesor con todos los datos del profesor que imparte la asignatura
     */
    public Profesor getProfesor() {
        return profesor;
    }
    
    /**
     * Método setter para el profesor
     * @param profesor Recibe un objeto de tipo Profesor para establecer el profesor que va a impartir la asignatura
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    /**
     * Método getter para el listado de alumnos
     * @return alumnos Devuelve un ArrayList de objetos Alumnos con todos los datos de los alumnos matriculados en la asignatura
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    /**
     * Método setter para los alumnos de la asignatura
     * @param alumnos Recibe un ArrayList de alumnos con los alumnos que van a cursar la asignatura
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
