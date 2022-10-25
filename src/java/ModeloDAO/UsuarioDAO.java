
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Usuario;

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
public class UsuarioDAO implements CRUD<Usuario>{
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u=new Usuario();
    @Override
    public List listar() {
        ArrayList<Usuario>list=new ArrayList<>();
//        String sql  ="select * from usuario";
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readUsuarios}");
//            ps=con.prepareStatement(sql);
            rs=cs.executeQuery();
            while(rs.next()){
                Usuario user=new Usuario();
                user.setCodigo(rs.getString("codigo"));
//                user.setFoto(rs.getBinaryStream("foto"));
                user.setDni(rs.getString("dni"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setDireccion(rs.getString("direccion"));
                user.setCelular(rs.getString("celular"));
                user.setEmail(rs.getString("email"));
                user.setEdad(rs.getInt("edad"));
                user.setCargo(rs.getString("cargo"));
                user.setUsuario(rs.getString("us"));
                user.setPassword(rs.getString("contra"));
                list.add(user);
            }
        } catch (Exception e) {
        }
        return list;
    }
    

    @Override
    public boolean add(Usuario obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call insertarUsuario(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, obj.getCodigo());
//            cs.setBlob(2, obj.getFoto());
            cs.setString(2, obj.getDni());
            cs.setString(3, obj.getNombre());
            cs.setString(4, obj.getApellido());
            cs.setString(5, obj.getDireccion());
            cs.setString(6, obj.getCelular());
            cs.setString(7, obj.getEmail());
            cs.setInt(8, obj.getEdad());
            cs.setString(9, obj.getCargo());
            cs.setString(10, obj.getUsuario());
            cs.setString(11, obj.getPassword());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Usuario listar(String id) {
        Usuario usuario=new Usuario();
//        String sql  ="select * from usuario where codigo='"+id+"'";
        
        try {
            con = cn.getConnection();
//            ps=con.prepareStatement(sql);
            CallableStatement cs = con.prepareCall("{call readUsuario(?)}");
            cs.setString(1, id);
            rs=cs.executeQuery();
            while(rs.next()){
                
                
                usuario.setCodigo(rs.getString("codigo"));
                usuario.setDni(rs.getString("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setEmail(rs.getString("email"));
                usuario.setEdad(rs.getInt("edad"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setUsuario(rs.getString("us"));
                usuario.setPassword(rs.getString("contra"));
            }
            
        } catch (Exception e) {
        }
        return usuario;
    }

    @Override
    public boolean edit(Usuario obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call modificarUsuario(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setString(2, obj.getDni());
            cs.setString(3, obj.getNombre());
            cs.setString(4, obj.getApellido());
            cs.setString(5, obj.getDireccion());
            cs.setString(6, obj.getCelular());
            cs.setString(7, obj.getEmail());
            cs.setInt(8, obj.getEdad());
            cs.setString(9, obj.getCargo());
            cs.setString(10, obj.getUsuario());
            cs.setString(11, obj.getPassword());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String id) {
//        String sql="delete from usuario where codigo='"+id+"'";
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call eliminarUsuario(?)}");
            cs.setString(1, id);
//            ps=con.prepareStatement(sql);
            cs.executeUpdate();
//            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
    public String obtenerCargo1(String cargo){
        String selector="";
        if(cargo.equals("1")){
           selector="selected";
        }
        return selector;
    }
    public String obtenerCargo2(String cargo){
        String selector="";
        if(cargo.equals("2")){
           selector="selected";
        }
        return selector;
    }
    public String obtenerCargo3(String cargo){
        String selector="";
        if(cargo.equals("3")){
           selector="selected";
        }
        return selector;
    }
    public String obtenerCargo0(String cargo){
        String selector="";
        if(cargo.equals("0")){
           selector="selected";
        }
        return selector;
    }
    
    public int contarUsuarios(){
        int cantU=0;
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readUsuarios}");
            rs=cs.executeQuery();
            while(rs.next()){
                Usuario user=new Usuario();
                user.setCodigo(rs.getString("codigo"));
                user.setDni(rs.getString("dni"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setDireccion(rs.getString("direccion"));
                user.setCelular(rs.getString("celular"));
                user.setEmail(rs.getString("email"));
                user.setEdad(rs.getInt("edad"));
                user.setCargo(rs.getString("cargo"));
                user.setUsuario(rs.getString("us"));
                user.setPassword(rs.getString("contra"));
                cantU++;
            }
        } catch (Exception e) {
        }
        return cantU;
    }
    
    public boolean verificarLogin(String usuario,String pass){
        boolean veri=false;
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call verificarUsuario('"+usuario+",'"+pass+"')}");
            rs=cs.executeQuery();
            while(rs.next()){
                String user=rs.getString("us");
                String contra=rs.getString("contra");
                if(user.equals(usuario) || contra.equals(pass)){
                    return true;
                }else{
                    return false;
                }
                
            }
        } catch (Exception e) {
        }
        
        return veri;
    }
 

    

    
    
}
