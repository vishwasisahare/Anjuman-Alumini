/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.controller;

import com.qaswatech.alumni.common.ForDateOrTime;
import com.qaswatech.alumni.model.UserModel;
import com.qaswatech.alumni.service.UserService;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Zoya
 */
@WebServlet(name = "UserImageController", urlPatterns = {"/UserImageController"})
public class UserImageController extends HttpServlet {

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
        UserModel model = new UserModel();
        ForDateOrTime fdatetime = new ForDateOrTime();
        FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(file_factory);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> myimgs = new ArrayList<>();

        try {
            List items = sfu.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem item = (FileItem) items.get(i);
                if (!item.isFormField()) {
                    File f = new File(item.getName().replace(item.getName(), fdatetime.getDAteWithTime() + "-" + i) + item.getContentType().replace("image/", "."));
                    item.write(f);
                    myimgs.add(f.getAbsolutePath());
                } else {
                    strings.add(item.getString());
                }
            }

            for (String data : strings) {
            }
            model.setProfile(myimgs.get(0));
           

            model.setUserId(strings.get(1));
            model.setName(strings.get(2));
            model.setEmail(strings.get(3));
            model.setPhone(strings.get(4));
            model.setBranch(strings.get(5));
            model.setDegree(strings.get(6));
            model.setPassoutYear(strings.get(7));
            message = service.update(model);
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            response.sendRedirect("profile-page.jsp?message=" + message);
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

}
