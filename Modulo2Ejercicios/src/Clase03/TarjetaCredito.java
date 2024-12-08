package Clase03;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con Tarjeta de Crédito por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Método de Pago: Tarjeta de Crédito";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0; // El monto debe ser mayor que 0
    }
}
