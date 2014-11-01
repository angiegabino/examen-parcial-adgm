
package com.adgm.controller;

import com.adgm.model.Evaluacion;
import com.adgm.model.HibernateUtilidades;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ADGM
 */
@WebServlet(name = "ServletExamen", urlPatterns = {"/resultados"})
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
       response.setContentType("text/html;charset=UTF-8"); 
    PrintWriter out = response.getWriter();
    
        String nombre=request.getParameter("nombre"); 
        String calificacion=request.getParameter("calificacion"); 
       out.println("Bienvenido " +nombre+ " tu calificacion es  " + calificacion ); 

       
       
       
    }
        }
    
















