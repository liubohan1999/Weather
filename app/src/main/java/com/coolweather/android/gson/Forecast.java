package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/**
 * 天气情况以及最高温和最低温显示
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
