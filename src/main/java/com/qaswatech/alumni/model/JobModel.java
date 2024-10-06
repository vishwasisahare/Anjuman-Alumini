/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.model;

/**
 *
 * @author Amit
 */
public class JobModel {
    
     private int id;
    private String jobId;
    private String userId;
    private String company;
    private String lpa;
    private String designation;  
    private String isVisible;
    private String isDeleted;
    private String createdAt;
    private String modifiedAt;
    
    
    public JobModel(){
    }

    public JobModel(int id, String jobId, String userId, String company, String lpa, String designation, String isVisible, String isDeleted, String createdAt, String modifiedAt) {
        this.id = id;
        this.jobId = jobId;
        this.userId = userId;
        this.company = company;
        this.lpa = lpa;
        this.designation = designation;
        this.isVisible = isVisible;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLpa() {
        return lpa;
    }

    public void setLpa(String lpa) {
        this.lpa = lpa;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "JobModel{" + "id=" + id + ", jobId=" + jobId + ", userId=" + userId + ", company=" + company + ", lpa=" + lpa + ", designation=" + designation + ", isVisible=" + isVisible + ", isDeleted=" + isDeleted + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
    }
    

      }
    
    

