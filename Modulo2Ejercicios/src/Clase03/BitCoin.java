package Clase03;

public class BitCoin implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con Bitcoin por: " + monto + " BTC");
    }

    @Override
    public String obtenerDetalles() {
        return "Método de Pago: Bitcoin";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >= 0.001; // El monto debe ser mayor o igual a 0.001 BTC
    }
}

