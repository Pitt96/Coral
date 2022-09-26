/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pitt
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String listarUsuario="Vistas/usuarios.jsp";
    String addUsuario="Vistas/CRUD/Add/agregarUsuario.jsp";
    String editUsuario="Vistas/CRUD/Update/modificarUsuario.jsp";
    Usuario u=new Usuario();
    UsuarioDAO udao=new UsuarioDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        
        String accion=request.getParameter("accion");
        
        if(accion.equalsIgnoreCase("listarUsuario")){
            acceso=listarUsuario;
        }else if(accion.equalsIgnoreCase("add")){
            acceso=addUsuario;
        }else if(accion.equalsIgnoreCase("Agregar")){
            String codigo=request.getParameter("txtCodigo");
            String dni=request.getParameter("txtDni");
            String nombre=request.getParameter("txtNombre");
            String apellido=request.getParameter("txtApellido");
            String direccion=request.getParameter("txtDireccion");
            String celular=request.getParameter("txtCelular");
            String correo=request.getParameter("txtCorreo");
            int edad=Integer.parseInt(request.getParameter("txtEdad"));
            String cargo=request.getParameter("txtCargo");
            String usuario=request.getParameter("txtUsuario");
            String pass=request.getParameter("txtContra");
            u.setCodigo(codigo);
            u.setDni(dni);
            u.setNombre(nombre);
            u.setApellido(apellido);
            u.setDireccion(direccion);
            u.setCelular(celular);
            u.setEmail(correo);
            u.setEdad(edad);
            u.setCargo(cargo);
            u.setUsuario(usuario);
            u.setPassword(pass);
            udao.add(u);
            acceso=listarUsuario;
        }else if(accion.equalsIgnoreCase("editar")){
            request.setAttribute("iduser", request.getParameter("id"));
            acceso=editUsuario;
        }else if(accion.equalsIgnoreCase("Actualizar")){
            String id=request.getParameter("txtCodigo");
            String dni=request.getParameter("txtDni");
            String nombre=request.getParameter("txtNombre");
            String apellido=request.getParameter("txtApellido");
            String direccion=request.getParameter("txtDireccion");
            String celular=request.getParameter("txtCelular");
            String correo=request.getParameter("txtCorreo");
            int edad=Integer.parseInt(request.getParameter("txtEdad"));
            String cargo=request.getParameter("txtCargo");
            String usuario=request.getParameter("txtUsuario");
            String pass=request.getParameter("txtContra");
            u.setCodigo(id);
            u.setDni(dni);
            u.setNombre(nombre);
            u.setApellido(apellido);
            u.setDireccion(direccion);
            u.setCelular(celular);
            u.setEmail(correo);
            u.setEdad(edad);
            u.setCargo(cargo);
            u.setUsuario(usuario);
            u.setPassword(pass);
            udao.edit(u);
            acceso=listarUsuario;
        }else if(accion.equalsIgnoreCase("eliminar")){
            String id = request.getParameter("id");
            u.setCodigo(id);
            udao.eliminar(id);
            acceso=listarUsuario;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
