/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
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
public class ControladorCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String agregarCliente = "";
    String modificarCliente = "";
    String listarCliente = "Vistas/clientes.jsp";

    ClienteDAO dao = new ClienteDAO();
    Cliente cl = new Cliente();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorUsuario at " + request.getContextPath() + "</h1>");
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
        String acceso = "";
        String accion = request.getParameter("accion");
        switch (accion) {
            case "AgregarC":
                acceso = agregarCliente;
                break;
            case "editar":
                String idP = request.getParameter("id");

                request.setAttribute("iduser", idP);
                acceso = modificarCliente;
                break;
            case "Agregar":
                Cliente o = new Cliente();
                int codigo = Integer.parseInt(request.getParameter("txtID"));
                String nombre=request.getParameter("txtNombre");
                String apellido=request.getParameter("txtApellido");
                String direccion=request.getParameter("txtDireccion");
                String celular=request.getParameter("txtCelular");
                String email=request.getParameter("txtEmail");
                int edad=Integer.parseInt(request.getParameter("txtEdad"));
                String sexo=request.getParameter("txtSexo");
                o.setId(codigo);
                o.setNombre(nombre);
                o.setApellido(apellido);
                o.setDireccion(direccion);
                o.setCelular(celular);
                o.setEmail(email);
                o.setEdad(edad);
                o.setSexo(sexo);
                dao.add(o);
                
                break;
            case "listarClientes":
                acceso = listarCliente;
                break;

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
