package com.knoldus.controller;

import com.knoldus.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * Represent the StatusController for running time
 */
public class StatusController {

    //    injecting AppService object
    @Autowired
    StatusService statusService;

    //    mapping request to this method
    @RequestMapping("/status")
    public String getStatusWithTime(){

//        we are using AppService class here that we have created
        return StatusService.getStatusWithTime();
    }

}