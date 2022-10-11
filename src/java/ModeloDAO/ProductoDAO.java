
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.CategoriaProducto;
import Modelo.Producto;
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
public class ProductoDAO implements CRUD<Producto>{
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    @Override
    public List listar() {
        List<Producto>lista=new ArrayList<>();
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readProductos}");
            rs=cs.executeQuery();
            
            while(rs.next()){
                Producto producto=new Producto();
                CategoriaProducto cat=new CategoriaProducto();
                CategoriaDAO cdao=new CategoriaDAO();
                producto.setCodigo(rs.getString("codigo"));
                producto.setRuta(rs.getString("ruta"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                String codCategoria=rs.getString("codigoCategoria");
                cat=(CategoriaProducto)cdao.listar(codCategoria);
                producto.setCat(cat);
                lista.add(producto);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
    
    @Override
    public Producto listar(String id) {
        Producto producto=new Producto();
        
        try {
            con = cn.getConnection();

            CallableStatement cs = con.prepareCall("{call readProducto(?)}");
            cs.setString(1, id);
            rs=cs.executeQuery();
            while(rs.next()){
                CategoriaProducto cat=new CategoriaProducto();
                CategoriaDAO cdao=new CategoriaDAO();
                
                producto.setCodigo(rs.getString("codigo"));
                producto.setRuta(rs.getString("ruta"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                String codCategoria=rs.getString("codigoCategoria");
                cat=(CategoriaProducto)cdao.listar(codCategoria);
                producto.setCat(cat);
                System.out.println("Los elementos: "+producto);
                
                
            }
            
        } catch (Exception e) {
        }
        return producto;
    }

    @Override
    public boolean add(Producto producto) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call insertarProducto(?,?,?,?,?,?)}");
            cs.setString(1, producto.getCodigo());
            cs.setString(2, producto.getRuta());
            cs.setString(3, producto.getNombre());
            cs.setDouble(4, producto.getPrecio());
            cs.setInt(5, producto.getStock());
            CategoriaProducto cat = new CategoriaProducto();
            cat=producto.getCat();
            cs.setString(6, cat.getCodigo());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Producto obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call modificarProducto(?,?,?,?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getRuta());
            cs.setString(3, obj.getNombre());
            cs.setDouble(4, obj.getPrecio());
            cs.setInt(5, obj.getStock());
            cs.setString(6, obj.getCat().getCodigo());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String id) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call eliminarProducto(?)}");
            cs.setString(1, id);

            cs.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }
    
    public int contarProductos(){
        int cantP=0;
        
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readProductos}");
            rs=cs.executeQuery();
            
            while(rs.next()){
                Producto producto=new Producto();
                CategoriaProducto cat=new CategoriaProducto();
                CategoriaDAO cdao=new CategoriaDAO();
                producto.setCodigo(rs.getString("codigo"));
                producto.setRuta(rs.getString("ruta"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                String codCategoria=rs.getString("codigoCategoria");
                cat=(CategoriaProducto)cdao.listar(codCategoria);
                producto.setCat(cat);
                cantP+=producto.getStock();
            }
        } catch (Exception e) {
        }
        return cantP;
    }
    
}
