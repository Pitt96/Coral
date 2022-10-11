
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.CategoriaProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pitt
 */
public class CategoriaDAO implements CRUD<CategoriaProducto>{
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    CategoriaProducto cp=new CategoriaProducto();
    @Override
    public List listar() {
       ArrayList<CategoriaProducto>list=new ArrayList<>();

        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readCategorias}");

            rs=cs.executeQuery();
            while(rs.next()){
                CategoriaProducto cat=new CategoriaProducto();
                cat.setCodigo(rs.getString("codigoCategoria"));
                cat.setNombre(rs.getString("nombre"));
                cat.setDescripcion(rs.getString("descripcion"));
                list.add(cat);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public CategoriaProducto listar(String id) {
         CategoriaProducto cat=new CategoriaProducto();
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readCategoria(?)}");
            cs.setString(1, id);
            rs=cs.executeQuery();
            while(rs.next()){
                cat.setCodigo(rs.getString("codigoCategoria"));
                cat.setNombre(rs.getString("nombre"));
                cat.setDescripcion(rs.getString("descripcion"));
                
            }
            
        } catch (Exception e) {
        }
        return cat;
    }

    @Override
    public boolean add(CategoriaProducto obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call insertarCategoria(?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getDescripcion());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(CategoriaProducto obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call modificarCategoria(?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getDescripcion());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String id) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call eliminarCategoria(?)}");
            cs.setString(1, id);

            cs.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }
    
}
