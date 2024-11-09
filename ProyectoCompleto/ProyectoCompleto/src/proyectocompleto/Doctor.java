/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompleto;


public class Doctor extends Persona {
    private String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad); // Llama al constructor de la superclase
        this.especialidad = especialidad;
    }

    // Método getter para la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Método setter para la especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método específico para doctores
    public void atenderPaciente() {
        System.out.println("El doctor " + nombre + " está atendiendo a un paciente.");
    }
}
