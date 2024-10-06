/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.model;

/**
 *
 * @author Zoya
 */
public class FeedbackModel {
    private Integer id;
    private String feedbackId;
    private String name;
    private String email;
    private String message;
    private String isVisible;
    private String isDeleted;
    private String createdAt;
    private String modifiedAt;

    public FeedbackModel() {
    }

    public FeedbackModel(Integer id, String feedbackId, String name, String email, String message, String isVisible, String isDeleted, String createdAt, String modifiedAt) {
        this.id = id;
        this.feedbackId = feedbackId;
        this.name = name;
        this.email = email;
        this.message = message;
        this.isVisible = isVisible;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        return "FeedbackModel{" + "id=" + id + ", feedbackId=" + feedbackId + ", name=" + name + ", email=" + email + ", message=" + message + ", isVisible=" + isVisible + ", isDeleted=" + isDeleted + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
    }
    
    
}
