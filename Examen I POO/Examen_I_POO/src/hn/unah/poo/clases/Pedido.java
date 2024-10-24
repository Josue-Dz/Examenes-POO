package hn.unah.poo.clases;

import java.util.ArrayList;
import java.util.List;

import hn.unah.poo.interfaces.MetodoPago;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();
    private double total;

    public void agregarProducto(Producto producto, int cantidad) {
        productos.add(producto);
        calcularTotal(cantidad);
    }

    public double calcularTotal(int cantidad) {

        for (Producto producto : productos) {
            total += producto.getPrecio() * cantidad;
        }

        return total;

    }

    public void procesarPedido(MetodoPago metodoDePago) {
        metodoDePago.procesarPago(total);
    }

}
