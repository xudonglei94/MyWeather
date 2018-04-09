package org.crazyit.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public  class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
