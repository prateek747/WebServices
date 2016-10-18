package com.webs.buzztechies.webservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

    public class MainActivity {

        @SerializedName("coord")
        @Expose
        private Coord coord;
        @SerializedName("weather")
        @Expose
        private List<Weather> weather = new ArrayList<Weather>();
        @SerializedName("base")
        @Expose
        private String base;
        @SerializedName("main")
        @Expose
        private Main main;
        @SerializedName("wind")
        @Expose
        private Wind wind;
        @SerializedName("clouds")
        @Expose
        private Clouds clouds;
        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("sys")
        @Expose
        private Sys sys;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("cod")
        @Expose
        private Integer cod;

        /**
         *
         * @return
         * The coord
         */
        public Coord getCoord() {
            return coord;
        }

        /**
         *
         * @param coord
         * The coord
         */
        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public MainActivity withCoord(Coord coord) {
            this.coord = coord;
            return this;
        }

        /**
         *
         * @return
         * The weather
         */
        public List<Weather> getWeather() {
            return weather;
        }

        /**
         *
         * @param weather
         * The weather
         */
        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public MainActivity withWeather(List<Weather> weather) {
            this.weather = weather;
            return this;
        }

        /**
         *
         * @return
         * The base
         */
        public String getBase() {
            return base;
        }

        /**
         *
         * @param base
         * The base
         */
        public void setBase(String base) {
            this.base = base;
        }

        public MainActivity withBase(String base) {
            this.base = base;
            return this;
        }

        /**
         *
         * @return
         * The main
         */
        public Main getMain() {
            return main;
        }

        /**
         *
         * @param main
         * The main
         */
        public void setMain(Main main) {
            this.main = main;
        }

        public MainActivity withMain(Main main) {
            this.main = main;
            return this;
        }

        /**
         *
         * @return
         * The wind
         */
        public Wind getWind() {
            return wind;
        }

        /**
         *
         * @param wind
         * The wind
         */
        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public MainActivity withWind(Wind wind) {
            this.wind = wind;
            return this;
        }

        /**
         *
         * @return
         * The clouds
         */
        public Clouds getClouds() {
            return clouds;
        }

        /**
         *
         * @param clouds
         * The clouds
         */
        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public MainActivity withClouds(Clouds clouds) {
            this.clouds = clouds;
            return this;
        }

        /**
         *
         * @return
         * The dt
         */
        public Integer getDt() {
            return dt;
        }

        /**
         *
         * @param dt
         * The dt
         */
        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public MainActivity withDt(Integer dt) {
            this.dt = dt;
            return this;
        }

        /**
         *
         * @return
         * The sys
         */
        public Sys getSys() {
            return sys;
        }

        /**
         *
         * @param sys
         * The sys
         */
        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public MainActivity withSys(Sys sys) {
            this.sys = sys;
            return this;
        }

        /**
         *
         * @return
         * The id
         */
        public Integer getId() {
            return id;
        }

        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        public MainActivity withId(Integer id) {
            this.id = id;
            return this;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        public MainActivity withName(String name) {
            this.name = name;
            return this;
        }

        /**
         *
         * @return
         * The cod
         */
        public Integer getCod() {
            return cod;
        }

        /**
         *
         * @param cod
         * The cod
         */
        public void setCod(Integer cod) {
            this.cod = cod;
        }

        public MainActivity withCod(Integer cod) {
            this.cod = cod;
            return this;
        }

    }
