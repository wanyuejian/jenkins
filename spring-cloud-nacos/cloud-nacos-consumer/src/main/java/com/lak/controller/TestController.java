package com.lak.controller;

import com.lak.exception.ResultEnum;
import com.lak.exception.ResultVO;
import com.lak.exception.ResultVOUtil;
import com.lak.exception.SellException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class TestController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private  RestTemplate restTemplate;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public ResultVO<String> echo(@PathVariable String str) {
        String forObject = null;

        if(str.length()<5){
            log.error("长度小于5  "+ResultEnum.PARAM_ERROR);
            throw new SellException(ResultEnum.PARAM_ERROR);
        }else {
            forObject = restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
        }
        return ResultVOUtil.success(forObject);
    }

}
