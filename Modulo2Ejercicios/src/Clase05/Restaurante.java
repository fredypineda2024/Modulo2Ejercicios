package Clase05;

public class Restaurante {
    private Cocina cocina;
    private Mesero mesero;
    private Caja caja;

    public Restaurante() {
        this.cocina = new Cocina();
        this.mesero = new Mesero();
        this.caja = new Caja();
    }

    public void operarRestaurante() {
        System.out.println("Operación del restaurante en curso...");
        cocina.prepararPlato(); // Llama al método de Cocina
        mesero.servir();        // Llama al método de Mesero
        caja.procesarPago();    // Llama al método de Caja
        System.out.println("Operación del restaurante completada.");
    }
}

