/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.dao;

import com.qaswatech.alumni.common.Database;
import com.qaswatech.alumni.model.FeedbackModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Zoya
 */
public class FeedbackDao {

    public static final String TABLENAME = "feedback";

    public String insert(FeedbackModel model) {
        Connection con = null;
        String message = null;
        CallableStatement cs = null;
        String sql = "insert into " + TABLENAME + " (feedback_id, name ,email ,message ) values (?,?,?,?)";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, model.getFeedbackId());
            cs.setString(2, model.getName());
            cs.setString(3, model.getEmail());
            cs.setString(4, model.getMessage());

            int row = cs.executeUpdate();

            if (row >= 1) {
                message = "Feedback Sent Successfull";
            }
        } catch (SQLException ex) {
            message = "unable to Sent because of : " + ex.getMessage();
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

    public ArrayList<FeedbackModel> findAll() {
        ArrayList<FeedbackModel> feedback = new ArrayList<>();
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = " select * from " + TABLENAME + " where is_visible = 1 ORDER BY id DESC ";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                feedback.add(new FeedbackModel(
                        rs.getInt("id"),
                        rs.getString("feedback_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("message"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at")
                )
                );
            }
        } catch (SQLException e) {
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

            } catch (SQLException e) {
            }
        }
        return feedback;
    }

    public FeedbackModel findById(String id) {
        FeedbackModel feed = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from " + TABLENAME + " where feedback_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                feed = new FeedbackModel(
                        rs.getInt("id"),
                        rs.getString("feedback_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("message"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at")
                );
            }
        } catch (SQLException e) {
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

            } catch (SQLException e) {
            }
        }
        return feed;
    }
}
