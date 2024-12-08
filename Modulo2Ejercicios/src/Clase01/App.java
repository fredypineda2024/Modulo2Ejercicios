package Clase01;
/*
 * Clase 1 Ejercicio Adicional:
Crear un sistema para gestionar información de estudiantes en un colegio.
Define la clase Estudiante con atributos:
-	nombre, edad, promedio
Métodos:
mostrarDetalles(): Muestra la información del estudiante.
esAprobado(): Devuelve true si el promedio es mayor o igual a 3.0.
En la clase principal (Main):
Crea una lista de estudiantes.
Muestra la información de todos los estudiantes.
Indica si están aprobados o no.

 */

 import java.util.ArrayList;

 public class App {
     public static void main(String[] args) {
         // Lista para almacenar estudiantes
         ArrayList<Estudiante> estudiantes = new ArrayList<>();
 
         // Agregar estudiantes a la lista
         estudiantes.add(new Estudiante("Fredy", 18, 4.5));
         estudiantes.add(new Estudiante("Gustavo", 20, 2.8));
         estudiantes.add(new Estudiante("Alejandra", 19, 3.2));
 
         // Mostrar detalles y verificar si están aprobados
         for (Estudiante estudiante : estudiantes) {
             estudiante.mostrarDetalles();
             System.out.println("¿Está aprobado?: " + (estudiante.esAprobado() ? "Sí" : "No"));
             System.out.println("-------------------");
         }
     }
 }
 
 