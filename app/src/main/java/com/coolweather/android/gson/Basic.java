package com.coolweather.android.gson;

import android.text.style.UpdateLayout;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public static String cityName;
    @SerializedName("id")
    public static String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
