package com.hll.configcenter.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

/**
 * Author: huangll
 * Written on 17/12/20.
 */
public class AppIdGenerateUtil {

  public static String generate(){
    return FastDateFormat.getInstance("yyyyMMddHHmmss").format(new Date())+ RandomStringUtils.randomNumeric(4);
  }

  public static void main(String[] args) {
    System.out.println(generate());
  }
}
