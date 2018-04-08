package org.crazyit.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/8.
 */

public class City extends DataSupport {
    private  int cityCode;
    private  int id;
    private String cityName;
    private int provinceId;

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {

        return cityCode;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
