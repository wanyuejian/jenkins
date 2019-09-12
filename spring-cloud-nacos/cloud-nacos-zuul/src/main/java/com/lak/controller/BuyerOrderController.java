package com.lak.controller;

import com.lak.exception.ResultEnum;
import com.lak.exception.ResultVO;
import com.lak.exception.ResultVOUtil;
import com.lak.exception.SellException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {


    //订单列表
    @GetMapping("/list")
    public ResultVO<String> list(@RequestParam("openid") String openid,
                                 @RequestParam(value = "page",defaultValue = "0") Integer page,
                                 @RequestParam(value = "size",defaultValue = "10") Integer size){
        if (openid == null){
            log.error("[查询订单列表] openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        return ResultVOUtil.success(openid+page+size);
    }



}