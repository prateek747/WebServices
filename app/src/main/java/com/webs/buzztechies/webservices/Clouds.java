package com.webs.buzztechies.webservices;

/**
 * Created by Pratoo on 18/10/16.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName("all")
    @Expose
    private Integer all;

    /**
     * @return The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * @param all The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

    public Clouds withAll(Integer all) {
        this.all = all;
        return this;
    }
}

