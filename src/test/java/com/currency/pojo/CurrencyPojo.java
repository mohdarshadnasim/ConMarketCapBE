package com.currency.pojo;

import java.util.List;

public class CurrencyPojo {


    private StatusPojo status;
    private List<DataPojo> data;

    public StatusPojo getStatus() {
        return status;
    }

    public void setStatus(StatusPojo status) {
        this.status = status;
    }

    public List<DataPojo> getData() {
        return data;
    }

    public void setData(List<DataPojo> data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "CurrencyPojo{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
