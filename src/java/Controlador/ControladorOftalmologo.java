/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Oftalmologo;
import ModeloDAO.OftalmologoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pitt
 */
public class ControladorOftalmologo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String agregarOftalmologo = "Vistas/CRUD/Add/agregarOftalmologo.jsp";
    String modificarOftalmologo = "Vistas/CRUD/Update/modificarOftalmologo.jsp";
    String listarOftalmologo = "Vistas/oftalmologo.jsp";

    OftalmologoDAO dao = new OftalmologoDAO();
    Oftalmologo of = new Oftalmologo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorOftalmologo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorOftalmologo at " + request.getContextPath() + "</h1>");
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
            case "AgregarO":
                acceso = agregarOftalmologo;
                break;
            case "editar":
                String idP = request.getParameter("id");

                request.setAttribute("iduser", idP);
                acceso = modificarOftalmologo;
                break;
            case "eliminar":
                String codE = request.getParameter("id");
                of.setCodigo(codE);
                dao.eliminar(codE);
                acceso = listarOftalmologo;
                break;
            case "Agregar":
                Oftalmologo o = new Oftalmologo();
                String codigo = request.getParameter("txtCodigo");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = null;
                try {
                    fecha = formato.parse(request.getParameter("txtFecha"));
                } catch (ParseException ex) {
                    Logger.getLogger(ControladorOftalmologo.class.getName()).log(Level.SEVERE, null, ex);
                }
                String especialidad = request.getParameter("txtEspecialidad");
                o.setCodigo(codigo);
                o.setHorario(fecha);
                o.setEspecialidad(especialidad);
                dao.add(o);
                acceso = listarOftalmologo;
                break;
            case "Actualizar":
                Oftalmologo o2 = new Oftalmologo();
                String codigo1 = request.getParameter("txtCodigo");
                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha1 = null;
                try {
                    fecha1 = formato1.parse(request.getParameter("txtFecha"));
                } catch (ParseException ex) {
                    Logger.getLogger(ControladorOftalmologo.class.getName()).log(Level.SEVERE, null, ex);
                }
                String especialidad1 = request.getParameter("txtEspecialidad");
                o2.setCodigo(codigo1);
                o2.setHorario(fecha1);
                o2.setEspecialidad(especialidad1);
                dao.edit(o2);
                acceso = listarOftalmologo;
                break;
            case "listarOftalmologo":
                acceso = listarOftalmologo;
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
