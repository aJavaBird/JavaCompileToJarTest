package com.haizhi.huaxing.http.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Uuid {
    /**
     * 获得16位的uuid（）
     * 算法：业务代码 + 日期 + java的UUID 的 HashCode值
     * */
    public static String get16UUID() {
        return get16UUID(null);
    }

    /**
     * 获得16位的uuid（当传入机器id为空时，则为16位，否则还需要加上机器id长度）
     * 算法：业务代码 + 日期 + java的UUID 的 HashCode值
     * */
    public static String get16UUID(String machineId) {
        // 1.开头两位，标识业务代码或机器代码（可变参数）
        if (machineId == null) {
            machineId = "";
        }
        // 2.中间四位整数，标识日期
        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
        String dayTime = sdf.format(new Date());
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        dayTime = (year + "").substring(2) + dayTime; // 改成6位
        // 3.生成uuid的hashCode值
        int hashCode = UUID.randomUUID().toString().hashCode();
        // 4.可能为负数
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        // UIID的hashcode值可能为9位或10位，但不超过10位。所以，String.format("%015d", hashCode)算法会在hashcode值前补至少5个无意义的0
        // 5.算法处理: 0-代表前面补充0; 10-代表长度为10; d-代表参数为正数型
        String value = machineId + dayTime + String.format("%010d", hashCode);
        return value;
    }
}
