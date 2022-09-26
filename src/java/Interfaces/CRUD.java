
package Interfaces;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Pitt
 */
public interface CRUD<G> {
    public List listar();
    public G listar(String id);
    public boolean add(G obj);
    public boolean edit(G obj);
    public boolean eliminar(String id);
}
