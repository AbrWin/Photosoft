package com.abrsoftware.photosoft.domain;

import android.location.Geocoder;

/**
 * Created by json on 29/06/16.
 */
public class Util {
    private Geocoder geocoder;
    private static final String GRAVATAR_URL = "http://www.gravatar.com/avatar/";

    public Util(Geocoder geocoder) {
        this.geocoder = geocoder;
    }
}
