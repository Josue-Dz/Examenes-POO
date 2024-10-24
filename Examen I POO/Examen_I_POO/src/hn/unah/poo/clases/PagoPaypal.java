package hn.unah.poo.clases;

import hn.unah.poo.interfaces.MetodoPago;

public class PagoPaypal implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago a traves de Paypal");
        System.out.println("Conectando a Paypal...");
        System.out.println("Pago realizado exitosamente!");
    }

}
