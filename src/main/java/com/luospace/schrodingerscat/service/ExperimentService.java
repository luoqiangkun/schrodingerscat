package com.luospace.schrodingerscat.service;

import com.luospace.schrodingerscat.common.Result;

import javax.servlet.http.HttpServletRequest;

public interface ExperimentService {
    public Result todo(HttpServletRequest request);
}
