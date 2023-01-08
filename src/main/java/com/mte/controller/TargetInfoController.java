package com.mte.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mte.dto.TargetInfoDTO;
import com.mte.service.TargetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TargetInfoController {
    @Autowired
    TargetInfoService targetInfoService;

    @RequestMapping("/")
    public String targetList(Model model) throws JsonProcessingException {
        List<TargetInfoDTO> list = targetInfoService.targetInfoList();
        String json = new ObjectMapper().writeValueAsString(list);
        model.addAttribute("result", json );
        return "redirect:/";
    }
}