/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.service;

import com.qaswatech.alumni.dao.PostDao;
import com.qaswatech.alumni.model.PostModel;
import com.qaswatech.alumni.utilities.Utils;
import java.util.ArrayList;

/**
 *
 * @author Zoya
 */
public class PostService {
    PostDao dao = new PostDao();
    
    public String insert(PostModel model){
        model.setPostId(Utils.generatePublicId(30));
        return dao.insert(model);
    }

    public ArrayList<PostModel> findAll() {
        return dao.findAll();
    }
    
    public ArrayList<PostModel> findAllByUserId(String id){
        return dao.findAllByUserId(id);
    }
    
     public String deletePost(String id){
        return dao.deletePost(id);
    }
}
