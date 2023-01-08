package com.mte.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mte.dao.TargetInfoDAO;
import com.mte.dto.TargetInfoDTO;
import com.mte.service.TargetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class TargetInfoController {
    @Autowired
    TargetInfoService targetInfoService;


    @RequestMapping("/")
    public @ResponseBody Map<String,Object> targetList(Model model) throws JsonProcessingException {
        Map<String,Object> resultMap = new HashMap<>();
        List<TargetInfoDTO> list = targetInfoService.targetInfoList();
        System.out.println(list.toString());

        resultMap.put("target_list",list);
        return resultMap;
    }
}