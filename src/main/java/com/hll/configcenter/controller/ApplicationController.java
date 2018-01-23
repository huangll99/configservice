package com.hll.configcenter.controller;

import com.hll.configcenter.model.Result;
import com.hll.configcenter.po.Application;
import com.hll.configcenter.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@RestController
@RequestMapping("/api/app")
public class ApplicationController {

  @Autowired
  private ApplicationService applicationService;

  @PostMapping("/add")
  public Result add(@RequestBody Application application) {
    applicationService.add(application);
    return new Result("success", "ok");
  }

  @GetMapping("/list")
  public List<Application> list() {
    System.out.println("list....");
    return applicationService.list();
  }
}
