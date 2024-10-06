/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.service;

import com.qaswatech.alumni.common.ImageKitResponse2;
import com.qaswatech.alumni.common.ImageKitUploadAPI;
import com.qaswatech.alumni.dao.UserDao;
import com.qaswatech.alumni.model.UserModel;
import com.qaswatech.alumni.response.ResponseMessage;
import com.qaswatech.alumni.utilities.Utils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amit
 */
public class UserService {

    UserDao dao = new UserDao();
    ImageKitUploadAPI ikua = new ImageKitUploadAPI();

    public String insert(UserModel model) {
        model.setUserId(Utils.generatePublicId(30));
        return dao.insert(model);
    }

    public String login(UserModel userModel, HttpServletRequest request) {
        String message = null;
        UserModel existingSeller = dao.findByPhone(userModel.getPhone());
        if (existingSeller == null) {
            throw new RuntimeException(ResponseMessage.USER_NOT_FOUND_WITH_PHONE.getMessage());
        }

        if (existingSeller.getPassword().equals(userModel.getPassword()) && (existingSeller.getUserType().equals("alumni") || existingSeller.getUserType().equals("student"))) {
            HttpSession session = request.getSession();
            session.setAttribute("Name", existingSeller.getName());
            session.setAttribute("Id", existingSeller.getUserId());
        } else {
            throw new RuntimeException(ResponseMessage.WRONG_PASSWORD.getMessage());
        }
        if(existingSeller.getUserRequest() == 0){
             message = ResponseMessage.LOGIN_SUCCESS.getMessage();
        }else{
            throw new RuntimeException("Your Account Verifying soon! Please Try Again Later");
        }
        return message;
    }

    public UserModel findByPhone(String phone) {
        return dao.findByPhone(phone);
    }

    public UserModel findByUserId(String id) {
        return dao.findByUserId(id);
    }

    public String update(UserModel model) {
        String userId = model.getUserId();
        ImageKitResponse2 ikr = ikua.uploadImage(model.getProfile(), userId, "false", "/Alumni/");
        model.setProfile(ikr.getUrl());
        return dao.update(model);
    }

    public String changeUserReq(String id) {
        return dao.changeUserReq(id);
    }
}
