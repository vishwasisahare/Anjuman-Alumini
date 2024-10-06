/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.response;

/**
 *
 * @author Amit
 */
public enum ResponseMessage {
    ID_CANT_EMPTY("Id cannot be empty!"),
    NAME_CANT_EMPTY("Student Name cannot be empty!"),
    PHONE_NO_CANT_EMPTY("Student Phone number cannot be empty!"),
    EMAIL_ID_CANT_EMPTY("Email id cannot be empty!"),
    PASSWORD_CANT_EMPTY("Password cannot be empty!"),
    DOB_CANT_EMPTY("Date of Birth cannot be empty!"),
    GENDER_CANT_EMPTY("Gender cannot be empty!"),
    COLLEGE_CANT_EMPTY("College cannot be empty!"),
    BRANCH_CANT_EMPTY("Branch cannot be empty!"),
    SEMESTER_CANT_EMPTY("Semester cannot be empty!"),
    AADHAR_NO_CANT_EMPTY("Aadhar number cannot be empty!"),
    PINCODE_CANT_EMPTY("Pincode cannot be empty!"),
    ADDRESS_CANT_EMPTY("Address cannot be empty!"),
    LOGIN_SUCCESS("Login Successfully!"),
    LOGOUT_SUCCESS("Logout Successfully!"),
    ALREADY_REGISTERED("Already registred, Please login to proceed!"),
    ALREADY_LOGIN("You are already LoggedIn!"),
    USER_NOT_FOUND_WITH_PHONE("No user found, Please check your phone number or register yourself!"),
    USER_NOT_FOUND_WITH_ID("No user found with provided id!"),
    WRONG_PASSWORD("You entered wrong password!"),
    DATA_ADDED("Details Added Successfully"),
    DATA_UPDATE("Details Updated Successfully"),
    UNABLE_TO_UPDATE("Unable to update because of : "),
    DATA_DELETED("Data Deleted Successfully");

    private String message;

    private ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
