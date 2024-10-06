/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.dao;

import com.qaswatech.alumni.common.Database;
import com.qaswatech.alumni.model.SocialModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amit
 */
public class SocialDao {

    public String insert(SocialModel model) {
        Connection con = Database.connectDb();  // for connection
        String message = null;  // for returning msg success/error/null
        CallableStatement cs = null;

        String sql = "insert into social_links(user_id, social_id, facebook, linkedin, instagram, twitter)"
                + "values (?,?,?,?,?,?)";
        try {
            cs = con.prepareCall(sql);
            cs.setString(1, model.getUserId());
            cs.setString(2, model.getSocialid());
            cs.setString(3, model.getFacebook());
            cs.setString(4, model.getLinkedin());
            cs.setString(5, model.getInstagram());
            cs.setString(6, model.getTwitter());

            int row = cs.executeUpdate();

            if (row >= 1) {
                message = "Record insert Successfull";
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

    public SocialModel findByUserId(String id) {
        SocialModel social = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from social_links where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();
            while (rs.next()) {
                social = new SocialModel(
                        rs.getInt("id"),
                        rs.getString("social_id"),
                        rs.getString("user_id"),
                        rs.getString("facebook"),
                        rs.getString("linkedin"),
                        rs.getString("instagram"),
                        rs.getString("twitter"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at")
                );
            }
        } catch (SQLException e) {
            social = null;
            System.out.println("com.qaswatech.alumni.dao.SocialDao.findByUserId()");
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
        return social;
    }
}
