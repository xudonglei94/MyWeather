package org.crazyit.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/8.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class  Sport{
        @SerializedName("txt")
        public String info;
    }
}
