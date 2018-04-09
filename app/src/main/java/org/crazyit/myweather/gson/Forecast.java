package org.crazyit.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/8.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
