package com.hll.configcenter.service;

import com.hll.configcenter.po.Application;
import com.hll.configcenter.repository.ApplicationRepository;
import com.hll.configcenter.utils.AppIdGenerateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@Service
public class ApplicationService {

  @Autowired
  private ApplicationRepository applicationRepository;

  public void add(Application application) {
    application.setAppId(AppIdGenerateUtil.generate());
    applicationRepository.save(application);
  }

  public List<Application> list() {
    return applicationRepository.findAll();
  }
}
