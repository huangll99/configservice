package com.hll.configcenter.model;

import java.util.List;

/**
 * Author: huangll
 * Written on 17/12/16.
 */
public class PageResult<T> {

  private Integer pageNo;

  private Integer pageSize;

  private Integer totalPage;

  private Integer totalNumber;

  private List<T> content;

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public Integer getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }

  public List<T> getContent() {
    return content;
  }

  public void setContent(List<T> content) {
    this.content = content;
  }

  public static <T> PageResultBuilder newBuilder() {
    return new PageResultBuilder<T>();
  }

  public static class PageResultBuilder<T> {
    private Integer pageNo;

    private Integer pageSize;

    private Integer totalPage;

    private Integer totalNumber;

    private List<T> content;

    public PageResultBuilder<T> pageNo(Integer pageNo) {
      this.pageNo = pageNo;
      return this;
    }

    public PageResultBuilder<T> pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public PageResultBuilder<T> totalPage(Integer totalPage) {
      this.totalPage = totalPage;
      return this;
    }

    public PageResultBuilder<T> totalNumber(Integer totalNumber) {
      this.totalNumber = totalNumber;
      return this;
    }

    public PageResultBuilder<T> content(List<T> content) {
      this.content = content;
      return this;
    }

    public PageResult<T> build() {
      PageResult<T> pageResult = new PageResult<>();
      pageResult.setPageNo(this.pageNo);
      pageResult.setPageSize(this.pageSize);
      pageResult.setTotalPage(this.totalPage);
      pageResult.setTotalNumber(this.totalNumber);
      pageResult.setContent(this.content);
      return pageResult;
    }
  }
}
