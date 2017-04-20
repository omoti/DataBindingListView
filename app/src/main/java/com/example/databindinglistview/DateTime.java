package com.example.databindinglistview;

import java.util.Date;

/**
 * 時刻
 */

public class DateTime {
    private String dateTime;

    public DateTime() {
        this.dateTime = new Date().toString();
    }

    public String getName() {
        return dateTime;
    }
}
