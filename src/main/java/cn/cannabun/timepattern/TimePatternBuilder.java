package cn.cannabun.timepattern;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimePatternBuilder {
    private String pattern;


    public static void main(String[] args) {
        Timestamp timestamp = Timestamp.valueOf("2019-01-01 02:22:22.123456");
        LocalDateTime now = LocalDateTime.now();
        String fff = now.format(DateTimeFormatter.ofPattern("SSS"));
        System.out.println(fff);
    }

    public String tada(){
        return pattern;
    }
}
