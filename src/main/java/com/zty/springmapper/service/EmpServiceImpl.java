package com.zty.springmapper.service;


import com.zty.springmapper.entity.Emp;
import com.zty.springmapper.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Emp> getAll() {
        List<Emp> list = empMapper.selectAll();
        for (Emp e : list) {
            e.setBirthday(new Date());
            System.out.println(e);
        }
        return list;
    }
}
