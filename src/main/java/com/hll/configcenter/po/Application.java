package com.hll.configcenter.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@Entity
public class Application {

  @Id
  @Column(name = "id", unique = true, nullable = false, length = 32)
  private String appId;

  private String appName;

  private String appDesc;

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getAppDesc() {
    return appDesc;
  }

  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }
}
