package hn.unah.poo.clases;

public class ProductoAlimenticio extends Producto{
    private String fechaExpiracion;

    public ProductoAlimenticio(String nombre, double precio, int stock, String fechaExpiracion) {
        super(nombre, precio, stock);
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
    
}
