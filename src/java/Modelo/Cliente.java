
package Modelo;

/**
 *
 * @author Pitt
 */
public class Cliente extends Persona{
    private int id;
    private String sexo;
    public Cliente(){}

    public Cliente(int id, String sexo, String nombre, String apellido, String direccion, String celular, String email, int edad) {
        super(nombre, apellido, direccion, celular, email, edad);
        this.id = id;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    

    
    
}
