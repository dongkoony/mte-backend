package com.mte.service;

import com.mte.dao.TargetInfoDAO;
import com.mte.dto.TargetInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetInfoService {
    @Autowired
    TargetInfoDAO dao;

    public List<TargetInfoDTO> targetInfoList(){
        return dao.targetInfoList();
    }
}
