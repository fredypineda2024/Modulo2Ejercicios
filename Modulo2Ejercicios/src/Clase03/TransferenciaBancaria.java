package Clase03;

public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado mediante Transferencia Bancaria por: $" + monto);
    }

    @Override
    public String obtenerDetalles() {
        return "Método de Pago: Transferencia Bancaria";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 10; // El monto debe ser mayor o igual a 10
    }
}

