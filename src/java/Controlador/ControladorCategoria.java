/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CategoriaProducto;
import ModeloDAO.CategoriaDAO;
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
public class ControladorCategoria extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String addcategoria = "Vistas/CRUD/Add/agregarCategoria.jsp";
    String editCategoria = "Vistas/CRUD/Update/modificarCategoria.jsp";
    String listarCategoria = "Vistas/categoria.jsp";
    CategoriaProducto catP=new CategoriaProducto();
    CategoriaDAO dao=new CategoriaDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorCategoria</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorCategoria at " + request.getContextPath() + "</h1>");
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
        if(accion.equals("AgregarCat")){
            acceso=addcategoria;
        }else if(accion.equals("Actualizar")){
            request.setAttribute("iduser", request.getParameter("id"));
            acceso=editCategoria;
        }else if(accion.equals("Modificar")){
            String txtCodigo = request.getParameter("txtCodigo");
            String txtNombre = request.getParameter("txtNombre");
            String txtDescripcion= request.getParameter("txtDescripcion");
            catP.setCodigo(txtCodigo);
            catP.setNombre(txtNombre);
            catP.setDescripcion(txtDescripcion);
            dao.edit(catP);
            acceso=listarCategoria;
        }else if(accion.equals("Agregar")){
            String txtCodigo = request.getParameter("txtCodigo");
            String txtNombre = request.getParameter("txtNombre");
            String txtDescripcion= request.getParameter("txtDescripcion");
            catP.setCodigo(txtCodigo);
            catP.setNombre(txtNombre);
            catP.setDescripcion(txtDescripcion);
            dao.add(catP);
            acceso=listarCategoria;
        }
//        switch(accion){
//            case "AgregarCat":
//                acceso=addcategoria;
//                break;
//            case "Actualizar":
//                request.setAttribute("iduser", request.getParameter("id"));
//                acceso=editCategoria;
//                break;
//            case "Modificar":
//                String id=request.getParameter("txtCodigo");
//                String nombre=request.getParameter("txtNombre");
//                String descripcion=request.getParameter("txtDescripcion");
//                catP.setCodigo(id);
//                catP.setNombre(nombre);
//                catP.setDescripcion(descripcion);
//                dao.edit(catP);
//                acceso=listarCategoria;
//                break;
//            case "eliminarCat":
//                String cod=request.getParameter("id");
//                catP.setCodigo(cod);
//                dao.eliminar(cod);
//                acceso=listarCategoria;
//                break;
//            case "Agregar":
//                String codigo = request.getParameter("txtCodigo");
//                String nombreCat = request.getParameter("txtNombre");
//                String descripcionCat = request.getParameter("txtDescripcion");
//                catP.setCodigo(codigo);
//                catP.setNombre(nombreCat);
//                catP.setDescripcion(descripcionCat);
//                dao.add(catP);
//                acceso=listarCategoria;
//                break;
//        }
        
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
