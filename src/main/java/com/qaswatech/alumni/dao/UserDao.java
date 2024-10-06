/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.dao;

import com.qaswatech.alumni.common.Database;
import com.qaswatech.alumni.model.UserModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amit
 */
public class UserDao {

    public static final String TABLENAME = "users";

    public String insert(UserModel model) {
        Connection con = Database.connectDb();
        String message = null;
        CallableStatement cs = null;

        String sql = "insert into users(user_id, name ,email ,phone ,password, user_type, branch, passout_year, user_request )"
                + " values (?,?,?,?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, model.getUserId());
            cs.setString(2, model.getName());
            cs.setString(3, model.getEmail());
            cs.setString(4, model.getPhone());
            cs.setString(5, model.getPassword());
            cs.setString(6, model.getUserType());
            cs.setString(7, model.getBranch());
            cs.setString(8, model.getPassoutYear());
            cs.setInt(9, model.getUserRequest());

            int row = cs.executeUpdate();

            if (row >= 1) {
                message = "Request Send to the Admin for Account Verify";
            }

        } catch (SQLException ex) {
            message = "unable to insert bcoz of : " + ex.getMessage();
        } finally {

            if (con != null) {

                try {
                    con.close();
                } catch (SQLException ex) {

                }

            }

        }

        return message;

    }

    public int login(String phone, String password) {
        Connection con = Database.connectDb();
        CallableStatement cs = null;
        ResultSet rs = null;
        int status = 0;

        try {
            String sql = "select * from user where phone_no=? AND password =? ";

            cs = con.prepareCall(sql);
            cs.setString(1, phone);
            cs.setString(2, password);
            rs = cs.executeQuery();

            while (rs.next()) {
                status = 1;
            }
        } catch (SQLException e) {
            System.out.println("Unable to login because of  : " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return status;
    }

    public UserModel findByPhone(String phone) {
        UserModel user = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from " + TABLENAME + " where phone = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, phone);
            rs = cs.executeQuery();
            while (rs.next()) {
                user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("password"),
                        rs.getString("degree"),
                        rs.getString("branch"),
                        rs.getString("user_type"),
                        rs.getString("profile_pic"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at"),
                        rs.getInt("user_request"),
                        rs.getString("passout_year")
                );
            }
        } catch (SQLException e) {
            user = null;
            System.out.println("com.qaswatech.alumni.dao.AlumniDao.findByPhone()" + e.getMessage());
        } finally {
            try {
                if (con != null) {

                    con.close();
                }
                con = null;
                if (cs != null) {
                    cs.close();
                }
                cs = null;
                if (rs != null) {
                    rs.close();
                }
                rs = null;
            } catch (SQLException ex) {
            }
        }
        return user;
    }

    public UserModel findByUserId(String id) {
        UserModel user = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from " + TABLENAME + " where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                user = new UserModel(
                        rs.getInt("id"),
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("password"),
                        rs.getString("degree"),
                        rs.getString("branch"),
                        rs.getString("user_type"),
                        rs.getString("profile_pic"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at"),
                        rs.getInt("user_request"),
                        rs.getString("passout_year")
                );
            }
        } catch (SQLException e) {
            user = null;
            System.out.println("com.qaswatech.alumni.dao.UserDao.findByUserId()");
        } finally {
            try {
                if (con != null) {

                    con.close();
                }
                con = null;
                if (cs != null) {
                    cs.close();
                }
                cs = null;
                if (rs != null) {
                    rs.close();
                }
                rs = null;
            } catch (SQLException ex) {
            }
        }
        return user;
    }

    public String update(UserModel model) {
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        String sql = "update " + TABLENAME + " set name = ?, email = ?, phone = ?, degree = ?, branch = ?, profile_pic = ?, passout_year = ? where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, model.getName());
            cs.setString(2, model.getEmail());
            cs.setString(3, model.getPhone());
            cs.setString(4, model.getDegree());
            cs.setString(5, model.getBranch());
            cs.setString(6, model.getProfile());
            cs.setString(7, model.getPassoutYear());
            cs.setString(8, model.getUserId());
            int rows = cs.executeUpdate();
            if (rows >= 1) {
                message = "User Updated Successfully";
            }
        } catch (SQLException e) {
            message = "Unable to update because of : " + e.getMessage() + " | At : " + this.getClass().getName();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;
            } catch (SQLException e) {
            }
        }
        return message;
    }
    
     public String changeUserReq(String id) {
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        String sql = " update " + TABLENAME + " set user_request = '1' where user_id = ? ";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            int row = cs.executeUpdate();
             if (row >= 1) {
                message = "Request Sent to the Admin";
            }
        } catch (SQLException e) {
            message = "Unable to Sent Request because of " + e.getMessage();

        } finally {
            try {
                if (con != null) {

                    con.close();
                }
                con = null;
                if (cs != null) {
                    cs.close();
                }
                cs = null;
            } catch (SQLException ex) {
            }
        }
        return message;
    }
}
