package Clase03;

// Interfaz que define los métodos comunes para los pagos
public interface MetodoPago {
    void procesarPago(double monto); // Procesar el pago
    String obtenerDetalles(); // Obtener detalles específicos del método de pago
    boolean validarMonto(double monto); // Validar el monto según las reglas
}
