package com.mte.controller;

import com.mte.dto.TargetHostDTO;
import com.mte.service.TargetHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TargetHostController {
    @Autowired
    TargetHostService targetHostService;

    @RequestMapping(value = "/targetAdd",method = RequestMethod.GET)
    public String targetAdd(TargetHostDTO dto){
        System.out.println(dto);
        targetHostService.targetAdd(dto);

        return "forward:/";
    }
}
