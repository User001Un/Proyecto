/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompleto;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        while (true) {
            System.out.println("¿Qué desea hacer? (1) Crear Deportista (2) Crear Doctor (3) Mostrar Lista (4) Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del deportista: ");
                    String nombreDeportista = scanner.nextLine();
                    System.out.print("Ingrese la edad del deportista: ");
                    int edadDeportista = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el deporte que practica: ");
                    String deporte = scanner.nextLine();

                    Deportista deportista = new Deportista(nombreDeportista, edadDeportista, deporte);
                    personas.add(deportista);
                    System.out.println(deportista.getNombre() + " ha sido agregado a la lista.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del doctor: ");
                    String nombreDoctor = scanner.nextLine();
                    System.out.print("Ingrese la edad del doctor: ");
                    int edadDoctor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la especialidad del doctor: ");
                    String especialidad = scanner.nextLine();

                    Doctor doctor = new Doctor(nombreDoctor, edadDoctor, especialidad);
                    personas.add(doctor);
                    System.out.println(doctor.getNombre() + " ha sido agregado a la lista.");
                    break;

                case 3:
                    System.out.println("Lista de personas:");
                    for (Persona persona : personas) {
                        if (persona instanceof Deportista) {
                            Deportista deportista1 = (Deportista) persona;
                            System.out.println("Deportista: " + deportista1.getNombre() + ", Edad: " + deportista1.getEdad() + ", Deporte: " + deportista1.getDeporte());
                        } else if (persona instanceof Doctor) {
                            Doctor doctor1 = (Doctor) persona;
                            System.out.println("Doctor: " + doctor1.getNombre() + ", Edad: " + doctor1.getEdad() + ", Especialidad: " + doctor1.getEspecialidad());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}