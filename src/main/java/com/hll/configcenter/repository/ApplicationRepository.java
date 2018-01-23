package com.hll.configcenter.repository;

import com.hll.configcenter.po.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
public interface ApplicationRepository extends JpaRepository<Application,String> {

}
