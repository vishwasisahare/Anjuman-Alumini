/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.service;

import com.qaswatech.alumni.dao.SocialDao;
import com.qaswatech.alumni.model.SocialModel;
import com.qaswatech.alumni.utilities.Utils;

/**
 *
 * @author Amit
 */
public class SocialService {
    SocialDao dao = new SocialDao();
    
    
    
    public String insert(SocialModel model) {
        model.setSocialid(Utils.generatePublicId(30));
         String message = dao.insert(model);
        
        return message;
    }

    public SocialModel findByUserId(String id) {
        return dao.findByUserId(id);
    }
    
    
}
