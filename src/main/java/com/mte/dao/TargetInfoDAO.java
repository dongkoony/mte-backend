package com.mte.dao;

import com.mte.dto.TargetInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TargetInfoDAO {

    @Autowired
    SqlSessionTemplate session;
    public List<TargetInfoDTO> targetInfoList() {
        List<TargetInfoDTO> list =
                session.selectList("com.mte.sql.CollectorMapper.selectTargetList");
        return list;
    }
}
