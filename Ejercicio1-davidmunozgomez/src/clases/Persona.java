/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Esta clase define objetos de tipo persona con dos subclases, Alumno y Profesor.
 * La clase Persona contiene los atributos comunes a Alumno y Profesor, es decir, DNI y nombre.
 * @author David
 */
public abstract class Persona {
    private String dni;
    private String nombre;

    /**
     * Constructor para un objeto persona.
     * Aunque la clase sea abstracta, el constructor es necesario para crear los constructores de Profesor y Alumno
     * @param dni Define el dni de la persona
     * @param nombre Define el nombre de la persona
     */
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
