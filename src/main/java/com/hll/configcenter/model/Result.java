package com.hll.configcenter.model;

/**
 * Author: huangll
 * Written on 18/1/6.
 */
public class Result {

  private String status;

  private String msg;

  public Result() {
  }

  public Result(String status, String msg) {
    this.status = status;
    this.msg = msg;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
