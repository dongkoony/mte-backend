package com.mte.dao;

import com.mte.dto.TargetHostDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TargetHostDAO {
    @Autowired
    SqlSessionTemplate session;

    public int targetAdd(TargetHostDTO dto){
        int n = session.insert("com.mte.sql.CollectorMapper.insertTargetHost",dto);
        return n;
    }
}
