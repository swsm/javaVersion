package org.example.datetimeformatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author swsm
 * @date 2024-10-17
 */
public class Test {

    /**
     * Java 17引入了新的日期时间API，提供了更好的日期周期格式化支持。
     */
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h m");
        System.out.println(time.format(formatter));
    }
    
}
