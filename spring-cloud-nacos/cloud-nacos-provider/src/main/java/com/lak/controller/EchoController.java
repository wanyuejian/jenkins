package com.lak.controller;

import com.lak.exception.ResultEnum;
import com.lak.exception.SellException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EchoController {

    Logger log = LoggerFactory.getLogger(EchoController.class);


    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {

        return "Hello Nacos Discovery " + str;
    }




}
