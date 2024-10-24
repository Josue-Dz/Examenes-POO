package hn.unah.poo.clases;

import hn.unah.poo.interfaces.MetodoPago;

public class PagoTarjetaCredito implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de credito");
        System.out.println("Verificando el pago con la entidad bancaria...");
        System.out.println("Pago realizado exitosamente!");
    }

}
