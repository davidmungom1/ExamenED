/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;

/**
 * Subclase de persona.
 * Esta clase define un objeto alumno añadiendo a los atributos de persona, los atributos fecha de matriculación y nacionalidad.
 * @author David
 * @version 09/04/2024
 */
public class Alumno extends Persona{
    private LocalDate fechaMatriculacion;
    private String nacionalidad;

    /**
     * Constructor para un objeto alumno
     * @param fechaMatriculacion Define la fecha en la que se ha matriculado el alumno
     * @param nacionalidad Define la nacionalidad del alumno
     * @param dni Define el dni del alumno
     * @param nombre Define el nombre del alumno
     */
    public Alumno(LocalDate fechaMatriculacion, String nacionalidad, String dni, String nombre) {
        super(dni, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }
    
    /**
     * Método getter para la fecha de matriculación
     * @return fechaMatriculacion Devuelve la fecha de matriculación del alumno
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }
    
    /** 
     * Método setter para la fecha de matriculación
     * @param fechaMatriculacion Recibe la fecha de matriculación a establecer en el objeto
     */

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }
    
    /**
     * Método getter para la nacionalidad
     * @return nacionalidad Devuelve la nacionalidad del alumno
     */
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    /**
     * Método setter para la nacionalidad
     * @param nacionalidad Recibe la nacionalidad a establecer en el objeto
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
