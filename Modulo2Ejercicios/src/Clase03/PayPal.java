package Clase03;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Método de Pago: PayPal";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 1 && monto <= 10000; // El monto debe estar entre 1 y 10,000
    }
}

