package com.hll.configcenter.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
@Entity
public class Config {

  @Id
  @GeneratedValue
  private long id;

  private String configKey;

  private String configValue;

  private String configDesc;

  private Date updateTime;

  private String appId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getConfigKey() {
    return configKey;
  }

  public void setConfigKey(String configKey) {
    this.configKey = configKey;
  }

  public String getConfigValue() {
    return configValue;
  }

  public void setConfigValue(String configValue) {
    this.configValue = configValue;
  }

  public String getConfigDesc() {
    return configDesc;
  }

  public void setConfigDesc(String configDesc) {
    this.configDesc = configDesc;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }
}
