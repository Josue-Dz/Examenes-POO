import hn.unah.poo.clases.ConfiguracionTienda;
import hn.unah.poo.clases.Pedido;
import hn.unah.poo.clases.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        // Unica instancia de tienda
        ConfiguracionTienda tienda = ConfiguracionTienda.getInstance("Mercadito Vilma",
                "Residencial Lomas de Jacaleapa", "HN");

        Producto producto1 = new Producto("Manzana Roja", 20, 100);
        Producto producto2 = new Producto("Manzana verde", 25, 90);

        Producto producto3 = new Producto("Laptop Dell", 15000, 5);
        Producto producto4 = new Producto("Laptop HP", 16000, 3);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        pedido1.agregarProducto(producto1, 2);
        pedido1.agregarProducto(producto2, 2);

        pedido2.agregarProducto(producto3, 1);
        pedido2.agregarProducto(producto4, 2);

        System.out.println(tienda.toString());

    }
}
