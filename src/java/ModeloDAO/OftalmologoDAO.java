/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Oftalmologo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pitt
 */
public class OftalmologoDAO implements CRUD<Oftalmologo>{
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Oftalmologo o=new Oftalmologo();
    @Override
    public List listar() {
        ArrayList<Oftalmologo>list=new ArrayList<>();
        try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readOftalmologos}");
            rs=cs.executeQuery();
            while(rs.next()){
                Oftalmologo of=new Oftalmologo();
                of.setCodigo(rs.getString("codigo"));
                of.setHorario(rs.getDate("horarioAtencion"));
                of.setEspecialidad(rs.getString("especialidad"));
                list.add(of);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Oftalmologo listar(String id) {
                Oftalmologo of=new Oftalmologo();
            try {
            con = cn.getConnection();
            CallableStatement cs = con.prepareCall("{call readOftalmologo(?)}");
            cs.setString(1, id);
            rs=cs.executeQuery();
            while(rs.next()){
                of.setCodigo(rs.getString("codigo"));
                of.setHorario(rs.getDate("horarioAtencion"));
                of.setEspecialidad(rs.getString("especialidad"));
                
            }
            
        } catch (Exception e) {
        }
        return of;
    }

    @Override
    public boolean add(Oftalmologo obj) {
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call insertarOftalmologo(?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setDate(2, (Date) o.getHorario());
            cs.setString(3, obj.getEspecialidad());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Oftalmologo obj) {
         try {
           con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call editarOftalmologo(?,?,?)}");
            cs.setString(1, obj.getCodigo());
            cs.setDate(2, (Date) o.getHorario());
            cs.setString(3, obj.getEspecialidad());
            cs.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String id) {
        
        try {
            con = cn.getConnection();
            CallableStatement cs=con.prepareCall("{call eliminarOftalmologo(?)}");
            cs.setString(1, id);
            cs.executeUpdate();

        } catch (Exception e) {
        }
        return false;
    }
    
}
