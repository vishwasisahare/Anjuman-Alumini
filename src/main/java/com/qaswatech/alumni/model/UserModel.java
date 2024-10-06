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
public class UserModel {

    private Integer id;
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String degree;
    private String branch;
    private String userType;
    private String profile;
    private String isVisible;
    private String isDeleted;
    private String createdAt;
    private String modifiedAt;
    private Integer userRequest;
    private String passoutYear;
    private Integer studentRequest;

    public UserModel() {
    }

    public UserModel(Integer id, String userId, String name, String email, String phone, String password, String degree, String branch, String userType, String profile, String isVisible, String isDeleted, String createdAt, String modifiedAt, Integer userRequest, String passoutYear, Integer studentRequest) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.degree = degree;
        this.branch = branch;
        this.userType = userType;
        this.profile = profile;
        this.isVisible = isVisible;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.userRequest = userRequest;
        this.passoutYear = passoutYear;
        this.studentRequest = studentRequest;
    }

    public UserModel(Integer id, String userId, String name, String email, String phone, String password, String degree, String branch, String userType, String profile, String isVisible, String isDeleted, String createdAt, String modifiedAt, Integer userRequest, String passoutYear) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.degree = degree;
        this.branch = branch;
        this.userType = userType;
        this.profile = profile;
        this.isVisible = isVisible;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.userRequest = userRequest;
        this.passoutYear = passoutYear;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
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

    public Integer getUserRequest() {
        return userRequest;
    }

    public void setUserRequest(Integer userRequest) {
        this.userRequest = userRequest;
    }

   

    public String getPassoutYear() {
        return passoutYear;
    }

    public void setPassoutYear(String passoutYear) {
        this.passoutYear = passoutYear;
    }

    public Integer getStudentRequest() {
        return studentRequest;
    }

    public void setStudentRequest(Integer studentRequest) {
        this.studentRequest = studentRequest;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", userId=" + userId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password + ", degree=" + degree + ", branch=" + branch + ", userType=" + userType + ", profile=" + profile + ", isVisible=" + isVisible + ", isDeleted=" + isDeleted + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", userRequest=" + userRequest + ", passoutYear=" + passoutYear + ", studentRequest=" + studentRequest + '}';
    }

    

    
}
