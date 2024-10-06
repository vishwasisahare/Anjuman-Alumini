/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.service;

import com.qaswatech.alumni.dao.JobDao;
import com.qaswatech.alumni.model.JobModel;
import com.qaswatech.alumni.utilities.Utils;

/**
 *
 * @author Amit
 */
public class JobService {

    JobDao dao = new JobDao();

    public String insert(JobModel model) {
        model.setJobId(Utils.generatePublicId(30));
        String message = dao.insert(model);

        return message;

    }

    public JobModel selectByUserId(String id) {
        return dao.selectByUserId(id);
    }

    public String update(JobModel model) {
        return dao.update(model);
    }

}
