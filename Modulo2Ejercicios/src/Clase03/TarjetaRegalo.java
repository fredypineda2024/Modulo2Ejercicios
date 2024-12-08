package Clase03;

public class TarjetaRegalo implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con Tarjeta de Regalo por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Método de Pago: Tarjeta de Regalo";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto <= 500; // El monto debe estar entre 0 y 500
    }
}
