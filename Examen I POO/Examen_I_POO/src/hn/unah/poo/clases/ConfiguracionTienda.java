package hn.unah.poo.clases;

public class ConfiguracionTienda {
    private String nombreTienda;
    private String direccion;
    private String moneda;

    private static ConfiguracionTienda uniqueIntance;

    private ConfiguracionTienda(String nombreTienda, String direccion, String moneda) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.moneda = moneda;
    }

    public static ConfiguracionTienda getInstance(String nombreTienda, String direccion, String moneda) {
        if (uniqueIntance == null) {
            uniqueIntance = new ConfiguracionTienda(nombreTienda, direccion, moneda);
        }
        return uniqueIntance;
    }

    @Override
    public String toString() {
        return "ConfiguracionTienda [nombreTienda=" + nombreTienda + ", direccion=" + direccion + ", moneda=" + moneda
                + "]";
    }

}
