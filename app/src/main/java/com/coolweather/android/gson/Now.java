package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/**
 * 显示天气情况
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
