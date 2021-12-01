package com.knoldus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StatusController {

    private static List<String> students= new ArrayList<>(Arrays.asList("Deepak","Kumar","MCA","Dhampur","Knoldus"));

    @RequestMapping("/name")
    public String getName(){

        return "Deepak";
    }

    @RequestMapping("students")
    public List<String> getStudents(){

        return students;

    }
    @RequestMapping("/status")
    public String getTime(){
        return (ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }
}
