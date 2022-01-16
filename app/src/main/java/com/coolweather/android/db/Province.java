package com.coolweather.android.db;

import org.litepal.exceptions.DataSupportException;

public class Province extends DataSupportException {
    private int id;
    private String provinceName;
    public int provinceId;
    public Province(String errorMessage) {
        super(errorMessage);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
