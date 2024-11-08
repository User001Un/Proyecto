/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte3;

class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;   

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;   

    }

    
    public void atenderPaciente() {
        System.out.println(nombre + " está atendiendo a un paciente en la especialidad de " + especialidad);
    }
}