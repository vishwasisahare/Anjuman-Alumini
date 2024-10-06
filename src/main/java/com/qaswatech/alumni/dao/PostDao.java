/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.dao;
import com.qaswatech.alumni.common.Database;
import com.qaswatech.alumni.model.PostModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Zoya
 */
public class PostDao {
      public static final String TABLENAME = "post";

    public String insert(PostModel model) {
        Connection con = null;
        String message = null;
        CallableStatement cs = null;
        String sql = "insert into " + TABLENAME + " (post_id, user_id ,title ,description ) values (?,?,?,?)";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, model.getPostId());
            cs.setString(2, model.getUserId());
            cs.setString(3, model.getTitle());
            cs.setString(4, model.getDescription());

            int row = cs.executeUpdate();

            if (row >= 1) {
                message = "Post Added Successfull";
            }
        } catch (SQLException ex) {
            message = "unable to Add because of : " + ex.getMessage();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                con = null;

                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException e) {
            }
        }
        return message;
    }
    
    public ArrayList<PostModel> findAll() {
        ArrayList<PostModel> bookings = new ArrayList();
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = " select * from " + TABLENAME + " where is_visible = 1 ORDER BY id DESC ";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                bookings.add(
                        new PostModel(
                                rs.getInt("id"),
                                rs.getString("post_id"),
                                rs.getString("user_id"),
                                rs.getString("title"),
                                rs.getString("description"),
                                rs.getString("post_status"),
                                rs.getString("is_visible"),
                                rs.getString("is_deleted"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                        )
                );
            }
        } catch (Exception e) {
            System.out.println("Unable to find data because of " + e.getMessage());
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
        return bookings;
    }
    
    public ArrayList<PostModel> findAllByUserId(String id) {
        ArrayList<PostModel> bookings = new ArrayList();
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = " select * from " + TABLENAME + " where is_visible = 1 and user_id = ? ORDER BY id DESC ";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                bookings.add(
                        new PostModel(
                                rs.getInt("id"),
                                rs.getString("post_id"),
                                rs.getString("user_id"),
                                rs.getString("title"),
                                rs.getString("description"),
                                rs.getString("post_status"),
                                rs.getString("is_visible"),
                                rs.getString("is_deleted"),
                                rs.getString("created_at"),
                                rs.getString("modified_at")
                        )
                );
            }
        } catch (Exception e) {
            System.out.println("Unable to find data because of " + e.getMessage());
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
        return bookings;
    }
    public String deletePost(String id){
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        String sql = " update " + TABLENAME + " set is_visible = '0' where post_id = ? ";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            int row = cs.executeUpdate();
             if (row >= 1) {
                message = "Post Deleted Successfully";
            }
        } catch (SQLException e) {
            message = "Unable to Delete because of " + e.getMessage();

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
