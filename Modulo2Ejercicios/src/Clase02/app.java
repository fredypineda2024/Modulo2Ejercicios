/*
 * Clase 2 Ejercicio Adicional:
Gestión de Vehículos
Implementar un sistema para gestionar diferentes tipos de vehículos.
1.	Crea una clase base Vehiculo con:
o	Atributos: marca, modelo, velocidadMaxima.
o	Métodos:
	Constructor para inicializar los atributos.
	mostrarDetalles(): Imprime los detalles del vehículo.
2.	Crea clases derivadas:
o	Carro: Atributo adicional numPuertas.
o	Moto: Atributo adicional tieneSidecar.
3.	En la clase principal (Main):
o	Crea objetos de tipo Carro y Moto.
o	Muestra sus detalles.
Recuerden implementa en las clases los métodos vistos como los getter
 y los setter, además de los sobrescritos (toString y equals)

 */
package Clase02;

public class app {
    public static void main(String[] args) {
        Carro carro = new Carro("Renault", "Logan", 200, 4);
        Moto moto = new Moto("Honda", "CBR", 120, true);
        
       System.out.println("Detalles del carro:");
        carro.mostrarDetalles();
        System.out.println();
        
        System.out.println("Detalles de la moto:");
        moto.mostrarDetalles();
    }
}   