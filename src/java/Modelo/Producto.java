
package Modelo;

/**
 *
 * @author Pitt
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private CategoriaProducto cat;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int stock, CategoriaProducto cat) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cat = cat;
    }

    public CategoriaProducto getCat() {
        return cat;
    }

    public void setCat(CategoriaProducto cat) {
        this.cat = cat;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
