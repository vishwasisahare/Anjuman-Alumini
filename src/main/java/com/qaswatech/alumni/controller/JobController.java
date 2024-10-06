/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.controller;

import com.qaswatech.alumni.model.JobModel;
import com.qaswatech.alumni.service.JobService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amit
 */
@WebServlet(name = "JobController", urlPatterns = {"/JobController"})
public class JobController extends HttpServlet {

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
    JobService service = new JobService();
    JobModel model = new JobModel();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        switch (action) {
            case "insert":
                insert(request, response);
                break;
            case "update":
                update(request, response);
                break;
            default:
                break;
        }

    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            model.setUserId(request.getParameter("userId"));
            model.setCompany(request.getParameter("company"));
            model.setLpa(request.getParameter("lpa"));
            model.setDesignation(request.getParameter("designation"));

            // creating service object
            message = service.insert(model);
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("profile-page.jsp#career?message=" + message);
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

    public JobModel selectByUserId(String id) {
        return service.selectByUserId(id);
    }

    private void update(HttpServletRequest request, HttpServletResponse response)throws IOException{
        try {
            model.setUserId(request.getParameter("userId"));
            model.setCompany(request.getParameter("company"));
            model.setLpa(request.getParameter("lpa"));
            model.setDesignation(request.getParameter("designation"));

            // creating service object
            message = service.update(model);
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("profile-page.jsp#career?message=" + message);
        }
    }
}
