package com.webs.buzztechies.webservices;

/**
 * Created by Pratoo on 18/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Double deg;

    /**
     *
     * @return
     * The speed
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     * The speed
     */
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Wind withSpeed(Double speed) {
        this.speed = speed;
        return this;
    }

    /**
     *
     * @return
     * The deg
     */
    public Double getDeg() {
        return deg;
    }

    /**
     *
     * @param deg
     * The deg
     */
    public void setDeg(Double deg) {
        this.deg = deg;
    }

    public Wind withDeg(Double deg) {
        this.deg = deg;
        return this;
    }

}

