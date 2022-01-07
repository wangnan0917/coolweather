package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
* Weather对这些类进行了引用。daily_forecast中包含的是一个数组，因此使用LIst集合
* */
public class Weather {
    //status数据，成功返回ok，失败返回具体原因
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
