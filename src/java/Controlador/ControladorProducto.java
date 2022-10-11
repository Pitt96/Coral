/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CategoriaProducto;
import Modelo.Producto;
import ModeloDAO.ProductoDAO;
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
public class ControladorProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String  agregarProducto="Vistas/CRUD/Add/agregarProducto.jsp";
    String modificarProducto="Vistas/CRUD/Update/modificarProducto.jsp";
    String listarProducto="Vistas/producto.jsp";
    
    ProductoDAO dao = new ProductoDAO();
    CategoriaProducto cat = new CategoriaProducto();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorProducto at " + request.getContextPath() + "</h1>");
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
        switch(accion){
            case "AgregarP":
                acceso=agregarProducto;
                break;
            case "editar":
                String idP=request.getParameter("id");
                
                request.setAttribute("iduser", idP);
                acceso=modificarProducto;
                break;
            case "eliminar":
                String codE = request.getParameter("id");
                cat.setCodigo(codE);
                dao.eliminar(codE);
                acceso=listarProducto;
                break;
            case "Agregar":
                Producto producto = new Producto();
                String codigo = request.getParameter("txtCodigo");
                String ruta = request.getParameter("txtRuta");
                String nombre = request.getParameter("txtNombre");
                double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                int stock = Integer.parseInt(request.getParameter("txtStock"));
                String categoria = request.getParameter("txtCat");
                producto.setCodigo(codigo);
                producto.setRuta(ruta);
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setStock(stock);
                cat.setCodigo(categoria);
                producto.setCat(cat);
                dao.add(producto);
                acceso=listarProducto;
                break;
            case "Actualizar":
                Producto producto2 = new Producto();
                String cod = request.getParameter("txtCodigo");
                String rut = request.getParameter("txtImagen");
                String nom = request.getParameter("txtNombre");
                double pre = Double.parseDouble(request.getParameter("txtPrecio"));
                int cant = Integer.parseInt(request.getParameter("txtStock"));
                String cate = request.getParameter("txtCat");
                producto2.setCodigo(cod);
                producto2.setRuta(rut);
                producto2.setNombre(nom);
                producto2.setPrecio(pre);
                producto2.setStock(cant);
                cat.setCodigo(cate);
                producto2.setCat(cat);
                dao.edit(producto2);
                acceso=listarProducto;
                break;
            case "listarProducto":
                acceso=listarProducto;
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
