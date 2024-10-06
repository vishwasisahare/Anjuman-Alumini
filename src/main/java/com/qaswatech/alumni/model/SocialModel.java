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
public class SocialModel {
       private int id;
    private String socialid;
    private String userId;
    private String facebook;
    private String linkedin;
    private String instagram;  
    private String twitter;
     private String isVisible;
    private String isDeleted;
    private String createdAt;
    private String modifiedAt;
    
    public SocialModel(){
    }

    public SocialModel(int id, String socialid, String userId, String facebook, String linkedin, String instagram, String twitter, String isVisible, String isDeleted, String createdAt, String modifiedAt) {
        this.id = id;
        this.socialid = socialid;
        this.userId = userId;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.instagram = instagram;
        this.twitter = twitter;
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

    public String getSocialid() {
        return socialid;
    }

    public void setSocialid(String socialid) {
        this.socialid = socialid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
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
        return "SocialModel{" + "id=" + id + ", socialid=" + socialid + ", userId=" + userId + ", facebook=" + facebook + ", linkedin=" + linkedin + ", instagram=" + instagram + ", twitter=" + twitter + ", isVisible=" + isVisible + ", isDeleted=" + isDeleted + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
    }
    
    
   
    
    
}
