/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.controller;

import com.qaswatech.alumni.dao.UserDao;
import com.qaswatech.alumni.model.UserModel;
import com.qaswatech.alumni.response.ResponseMessage;
import com.qaswatech.alumni.service.UserService;
import com.qaswatech.alumni.utilities.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amit
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

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
    UserService service = new UserService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "insert":
                insert(request, response);
                break;

            case "login":
                login(request, response);
                break;
            case "userReq":
                message = service.changeUserReq(request.getParameter("userId"));
                response.sendRedirect("profile-page.jsp?message=" + message);
                break;
            case "logout":
                HttpSession session = request.getSession();
                session.removeAttribute("Name");
                session.removeAttribute("Id");
                session.invalidate();
                response.sendRedirect("index.jsp?message=Logout successfully");
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

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserModel model = new UserModel();
        try {

            UserModel existingUser = service.findByPhone(request.getParameter("phone"));
            if (existingUser == null) {
                model.setName(request.getParameter("fullname"));
                model.setEmail(request.getParameter("email"));
                model.setPhone(request.getParameter("phone"));
                model.setPassword(request.getParameter("password"));
                model.setUserType(request.getParameter("userType"));
                model.setBranch(request.getParameter("branch"));
                model.setPassoutYear(request.getParameter("passYear"));
                model.setUserRequest(2);// request 1
                message = service.insert(model);

            } else if (existingUser.getPhone().equals(request.getParameter("phone"))) {
                throw new RuntimeException(ResponseMessage.ALREADY_REGISTERED.getMessage());
            }
        } catch (Exception e) {
            message = e.getMessage();
        } finally {

            response.sendRedirect("index.jsp?message=" + message);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserModel model = new UserModel();
        try {
            model.setPhone(Utils.requireNonNull(request.getParameter("phone"), ResponseMessage.PHONE_NO_CANT_EMPTY.getMessage()));
            model.setPassword(Utils.requireNonNull(request.getParameter("password"), ResponseMessage.PASSWORD_CANT_EMPTY.getMessage()));

            message = service.login(model, request);
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            if ("Login Successfully!".equals(message)) {
                response.sendRedirect("feeds.jsp?message=" + message);
            } else {
                response.sendRedirect("index.jsp?message=" + message);
            }
        }
    }

    public UserModel findByUserId(String id) {
        return service.findByUserId(id);
    }
}
