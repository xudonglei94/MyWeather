package org.crazyit.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}
