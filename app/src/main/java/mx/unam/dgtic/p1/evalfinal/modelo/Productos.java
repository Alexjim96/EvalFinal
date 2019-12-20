package mx.unam.dgtic.p1.evalfinal.modelo;

public class Productos {
    private int id;
    private String nombre;
    private String marca;
    private String vendedor;
    private boolean disponible;
    private double precio;

    public Productos(int id, String nombre, String marca, String vendedor, boolean disponible, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.vendedor = vendedor;
        this.disponible = disponible;
        this.precio = precio;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
