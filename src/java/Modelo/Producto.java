
package Modelo;

import java.io.InputStream;

/**
 *
 * @author Pitt
 */
public class Producto {
    private String codigo;
    private String ruta;
    private String nombre;
    private double precio;
    private int stock;
    private CategoriaProducto cat;

    public Producto() {
    }

    public Producto(String codigo, String ruta, String nombre, double precio, int stock, CategoriaProducto cat) {
        this.codigo = codigo;
        this.ruta = ruta;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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

    public CategoriaProducto getCat() {
        return cat;
    }

    public void setCat(CategoriaProducto cat) {
        this.cat = cat;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
    
}
