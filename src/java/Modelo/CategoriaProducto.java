
package Modelo;

/**
 *
 * @author Pitt
 */
public class CategoriaProducto {
    private String codigo;
    private String nombre;
    private String descripcion;

    public CategoriaProducto() {
    }

    public CategoriaProducto(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
}
