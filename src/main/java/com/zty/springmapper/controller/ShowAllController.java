package com.zty.springmapper.controller;

import com.zty.springmapper.entity.Emp;
import com.zty.springmapper.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/es")
public class ShowAllController {
    //这是拉取修改
    //这是推送修改
    //zhe
    @Autowired
    private EmpService empService;

    @RequestMapping("/QueryAll")
    public List<Emp> QueryAll() {
        return empService.getAll();
    }
}




