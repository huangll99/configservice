package com.hll.configcenter.model;

/**
 * Author: huangll
 * Written on 18/1/13.
 */
public class ConfigQuery extends PageReq{

  private String appId;

  private String configKey;

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getConfigKey() {
    return configKey;
  }

  public void setConfigKey(String configKey) {
    this.configKey = configKey;
  }
}
