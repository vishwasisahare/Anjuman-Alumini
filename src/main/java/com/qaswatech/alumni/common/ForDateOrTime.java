/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.alumni.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Azher
 */
public class ForDateOrTime {

    SimpleDateFormat todaydate, timenow, datewithtime;

    public String getDate() {
        Date date = new Date();
        todaydate = new SimpleDateFormat("dd-MM-yyyy");
        return todaydate.format(date);

    }

    public String getTime() {
        Date date = new Date();
        timenow = new SimpleDateFormat("hh:mm:ss");
        return timenow.format(date);

    }
      public String getDAteWithTime() {
        Date date = new Date();
        datewithtime = new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
        return datewithtime.format(date);

    }

}
