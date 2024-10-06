/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.dao;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import com.qaswatech.alumni.common.Database;
import com.qaswatech.alumni.model.JobModel;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amit
 */
public class JobDao {

    public String insert(JobModel model) {
        String message = null;
        Connection conn = null;
        CallableStatement cs = null;

        String sql = "insert into job (job_id, user_id, company, lpa, designation)"
                + "values (?,?,?,?,?)";

        try {
            conn = Database.connectDb();
            cs = conn.prepareCall(sql);
            cs.setString(1, model.getJobId());
            cs.setString(2, model.getUserId());
            cs.setString(3, model.getCompany());
            cs.setString(4, model.getLpa());
            cs.setString(5, model.getDesignation());

            int row = cs.executeUpdate();

            if (row >= 1) {
                message = "Record insert Successfull";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            message = e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                conn = null;

                if (cs != null) {
                    cs.close();
                }
                cs = null;

            } catch (Exception e) {
            }
            return message;
        }

    }

    public JobModel selectByUserId(String id) {

        JobModel model = null;
        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        String sql = "select * from job where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();

            while (rs.next()) {
                model = new JobModel(
                        rs.getInt("id"),
                        rs.getString("job_id"),
                        rs.getString("user_id"),
                        rs.getString("company"),
                        rs.getString("lpa"),
                        rs.getString("designation"),
                        rs.getString("is_visible"),
                        rs.getString("is_deleted"),
                        rs.getString("created_at"),
                        rs.getString("modified_at")
                );
            }

        } catch (Exception e) {
            System.out.println("error in SelectById() " + e.getMessage());
        }
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

        return model;
    }

    // count of job row 
    public int getJobCountById(String id) {

        Connection con = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        int row = 0;
        String sql = "select count(*) from job where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, id);
            rs = cs.executeQuery();

            while (rs.next()) {
                row = rs.getInt(1);

            }

        } catch (Exception e) {
            System.out.println("error in SelectById() " + e.getMessage());
        }
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

        return row;
    }

    public String update(JobModel model) {
        String message = null;
        Connection con = null;
        CallableStatement cs = null;
        String sql = "update job set company = ?, lpa = ?, designation = ? where user_id = ?";
        try {
            con = Database.connectDb();
            cs = con.prepareCall(sql);
            cs.setString(1, model.getCompany());
            cs.setString(2, model.getLpa());
            cs.setString(3, model.getDesignation());
            cs.setString(4, model.getUserId());
            int rows = cs.executeUpdate();
            if (rows >= 1) {
                message = "Job Updated Successfully";
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

}
