package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MS on 2017/8/1.
 */

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("tex_d")
        public String info;
    }
}
