/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Subclase de persona.
 * Esta clase define un objeto profesor añadiendo a los atributos de persona, el atributo departamento.
 * @author David
 * @version 09/04/2024
 */
public class Profesor extends Persona{
    private String departamento;

    /**
     * Constructor para un objeto alumno
     * @param departamento Define el departamento al que pertenece el profesor
     * @param dni Define el dni del profesor
     * @param nombre Define el nombre del profesor
     */
    public Profesor(String departamento, String dni, String nombre) {
        super(dni, nombre);
        this.departamento = departamento;
    }
    
    /**
     * Método getter para el departamento
     * @return departamento Devuelve el departamneto al que pertenece el profesor
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * Método setter para el departamento
     * @param departamento Recibe el departamento a establecer en el objeto 
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
