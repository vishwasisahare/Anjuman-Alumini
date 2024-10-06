/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.controller;

import com.qaswatech.alumni.model.PostModel;
import com.qaswatech.alumni.service.PostService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zoya
 */
@WebServlet(name = "PostController", urlPatterns = {"/PostController"})
public class PostController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String message = null;
    PostService service = new PostService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "insert":
                insert(request, response);
                break;
            case "delete":
                message = service.deletePost(request.getParameter("id"));
                response.sendRedirect("dashboard.jsp?message=" + message);
                break;
            default:
                break;
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
        processRequest(request, response);
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

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PostModel model = new PostModel();
        try{
           model.setUserId(request.getParameter("userId"));
           model.setTitle(request.getParameter("title"));
           model.setDescription(request.getParameter("description"));
           
           message = service.insert(model);
           
        }catch(Exception e){
            message = e.getMessage();
        }finally{
            response.sendRedirect("dashboard.jsp?message=" + message);
        }
    }
    
    public ArrayList<PostModel> findAll(){
        return service.findAll();
    }
    
    public ArrayList<PostModel> findAllByUserId(String id){
        return service.findAllByUserId(id);
    }

}
