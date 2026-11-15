package com.tenjin.android.store;

import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class QueueEvent {
    private Date date;
    private String endpoint;
    private int id;
    private Map<String, String> params;

    public Date getDate() {
        return this.date;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public int getId() {
        return this.id;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setParams(Map<String, String> map) {
        this.params = map;
    }
}
