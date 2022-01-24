package com.luospace.schrodingerscat.service.impl;

import com.luospace.schrodingerscat.common.Result;
import com.luospace.schrodingerscat.dao.ExperimentMapper;
import com.luospace.schrodingerscat.entity.Experiment;
import com.luospace.schrodingerscat.service.ExperimentService;
import com.luospace.schrodingerscat.util.IpUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Random;
@Service
public class ExperimentServiceImpl implements ExperimentService {
    @Resource
    ExperimentMapper experimentMapper;

    @Override
    public Result todo(HttpServletRequest request) {
        Random random = new Random();
        Experiment experiment = new Experiment();
        experiment.setStatus(random.nextInt(2));
        experiment.setIp(IpUtil.getIp(request));
        Date date = new Date();
        experiment.setCreatedAt(date);
        int id = experimentMapper.insert(experiment);
        System.out.println("********************");
        System.out.println(id);
        System.out.println("********************");
        return Result.success(experiment);
    }
}
