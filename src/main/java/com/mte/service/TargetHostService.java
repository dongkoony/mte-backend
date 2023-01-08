package com.mte.service;

import com.mte.dao.TargetHostDAO;
import com.mte.dto.TargetHostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetHostService {

    @Autowired
    TargetHostDAO dao;

    public int targetAdd(TargetHostDTO dto){
        int n = dao.targetAdd(dto);
        return n;
    }
}
