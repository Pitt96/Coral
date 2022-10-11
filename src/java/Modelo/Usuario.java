
package Modelo;

import java.io.InputStream;

/**
 *
 * @author Pitt
 */
public class Usuario extends Persona{
    private String codigo;
    private String dni;
    private String cargo;
    private String usuario;
    private String password;
//    private InputStream foto;
    public Usuario() {
    }

    
    public Usuario(String codigo, String dni, String nombre, String apellido, String direccion, String celular, String email, int edad, String cargo, String usuario, String password) {
        super(nombre, apellido, direccion, celular, email, edad);
        this.codigo = codigo;
        
        this.dni = dni;
        this.cargo = cargo;
        this.usuario = usuario;
        this.password = password;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    

    
    
    
    
}
