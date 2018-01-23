package com.hll.configcenter.repository;

import com.hll.configcenter.po.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
public interface ConfigRepository extends JpaRepository<Config, Long>, JpaSpecificationExecutor<Config>, CrudRepository<Config, Long> {
  List<Config> findByAppId(String appId);
}
