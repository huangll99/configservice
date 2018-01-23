package com.hll.configcenter.controller;

import com.alibaba.fastjson.JSON;
import com.hll.configcenter.model.ConfigQuery;
import com.hll.configcenter.model.PageResult;
import com.hll.configcenter.model.Result;
import com.hll.configcenter.po.Config;
import com.hll.configcenter.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@RestController
@RequestMapping("/api/config")
public class ConfigController {

  @Autowired
  private ConfigService configService;


  @PostMapping("/add")
  public Result add(@RequestBody Config config) {
    configService.add(config);

    return new Result("success", "ok");
  }

  @GetMapping("/list")
  public List<Config> list() {
    return configService.list();
  }

  @GetMapping("/{appId}")
  public List<Config> getByAppId(@PathVariable("appId") String appId) {
    return configService.getByAppId(appId);
  }

  @PostMapping("/query")
  public PageResult<Config> query(@RequestBody ConfigQuery configQuery) {
    System.out.println(JSON.toJSONString(configQuery));

    return configService.query(configQuery);
  }

  @PostMapping("/edit")
  public Result edit(@RequestBody Config config) {
    configService.edit(config);

    return new Result("success", "ok");
  }

  @GetMapping("/delete")
  public Result delete(Long configId) {
    configService.delete(configId);
    return new Result();
  }
}
