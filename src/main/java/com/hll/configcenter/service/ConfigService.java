package com.hll.configcenter.service;

import com.hll.configcenter.model.ConfigQuery;
import com.hll.configcenter.model.PageReq;
import com.hll.configcenter.model.PageResult;
import com.hll.configcenter.po.Config;
import com.hll.configcenter.repository.ConfigRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Date;
import java.util.List;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@Service
public class ConfigService {

  @Autowired
  private ConfigRepository configRepository;

  public void add(Config config) {
    config.setUpdateTime(new Date());
    configRepository.save(config);
  }

  public List<Config> list() {
    return configRepository.findAll();
  }

  public List<Config> getByAppId(String appId) {

    return configRepository.findByAppId(appId);
  }

  public void edit(Config config) {
    config.setUpdateTime(new Date());
    configRepository.saveAndFlush(config);
  }

  public PageResult<Config> query(ConfigQuery configQuery) {
    Page<Config> configs = configRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
      Path<String> appIdPath = root.get("appId");
      Path<String> configKeyPath = root.get("configKey");
      if (StringUtils.isNotEmpty(configQuery.getConfigKey())){
        criteriaQuery.where(criteriaBuilder.equal(appIdPath, configQuery.getAppId())).where(criteriaBuilder.equal(configKeyPath, configQuery.getConfigKey())); //这里可以设置任意条查询条件
      }else {
        criteriaQuery.where(criteriaBuilder.equal(appIdPath, configQuery.getAppId())); //这里可以设置任意条查询条件
      }
      return criteriaQuery.getRestriction();
    }, new PageRequest(configQuery.getPageNo() - 1, configQuery.getPageSize(),
        new Sort(Sort.Direction.DESC, "updateTime")));

    return PageResult.newBuilder().content(configs.getContent())
        .pageNo(configQuery.getPageNo()).totalNumber((int) configs.getTotalElements()).pageSize(configs.getTotalPages())
        .build();
  }

  public void delete(Long configId) {
    configRepository.delete(configId);
  }
}
