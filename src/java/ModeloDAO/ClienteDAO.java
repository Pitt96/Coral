package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Cliente;
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
public class ClienteDAO implements CRUD<Cliente> {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente c = new Cliente();

    @Override
    public List listar() {
        ArrayList<Cliente> list = new ArrayList<>();
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readClientes}");
            rs = cs.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getNString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("correo"));
                c.setEdad(rs.getInt("edad"));
                c.setSexo(rs.getString("sexo"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clientes");
        } finally {

        }
        return list;
    }

    @Override
    public Cliente listar(String id) {
        Cliente cl = new Cliente();
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readCliente(?)}");
            cs.setString(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                cl.setId(rs.getInt("id"));
                cl.setNombre(rs.getNString("nombre"));
                cl.setApellido(rs.getString("apellido"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setCelular(rs.getString("celular"));
                cl.setEmail(rs.getString("correo"));
                cl.setEdad(rs.getInt("edad"));
                cl.setSexo(rs.getString("sexo"));

            }
        } catch (Exception e) {
            System.out.println("Error al listar un cliente");
        } finally {

        }
        return cl;
    }

    @Override
    public boolean add(Cliente cliente) {
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call insertarCliente(?,?,?,?,?,?,?)}");
            cs.setString(1, cliente.getNombre());
            cs.setString(2, cliente.getApellido());
            cs.setString(3, cliente.getDireccion());
            cs.setString(4, cliente.getCelular());
            cs.setString(5, cliente.getEmail());
            cs.setInt(6, cliente.getEdad());
            cs.setString(7, cliente.getSexo());
            cs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al agregar un cliente");
        } finally {
        }
        return false;
    }

    @Override
    public boolean edit(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
