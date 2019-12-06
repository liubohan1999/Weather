package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/**
 * 城市和城市对应的天气id
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
