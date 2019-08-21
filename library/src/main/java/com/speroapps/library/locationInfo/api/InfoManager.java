package com.speroapps.library.locationInfo.api;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.speroapps.library.locationInfo.model.ResponseModel;

/**
 * Created by Fung LAM on 04/12/2014.
 */
public class InfoManager {

    private static final String ENDPOINT = "http://ip-api.com/json/?fields=status,message,country,countryCode,isp,region,regionName,city,zip,lat,lon,timezone,currency,org,as,query,asname";
    private RequestQueue mRequestQueue;

    public InfoManager(RequestQueue requestQueue) {
        mRequestQueue = requestQueue;
    }

    @SuppressWarnings("unchecked")
    public void getGeoIpInfo(Response.Listener<ResponseModel> listener, Response.ErrorListener errorListener){
        GsonObjectRequest request = new GsonObjectRequest(Request.Method.GET, ENDPOINT
                , ResponseModel.class, null, listener, errorListener);

        mRequestQueue.add(request);
    }

}
