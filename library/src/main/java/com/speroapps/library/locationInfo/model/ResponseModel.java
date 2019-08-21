package com.speroapps.library.locationInfo.model;

import com.google.gson.annotations.SerializedName;


/**
 * Created by Fung LAM on 17/11/2015.
 */
public class ResponseModel {

    @SerializedName("query")
    private String ip;
    @SerializedName("message")
    private String message;
    @SerializedName("city")
    private String city;
    @SerializedName("region")
    private String region;
    @SerializedName("regionName")
    private String regionName;
    @SerializedName("country")
    private String country;
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lon")
    private double longitude;
    @SerializedName("currency")
    private String currency;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("as")
    private String as;
    @SerializedName("asname")
    private String asname;
    @SerializedName("org")
    private String org;
    @SerializedName("zip")
    private String zip;
    @SerializedName("isp")
    private String isp;

    public ResponseModel() {}

    public String messageToString() {
        return "Data : " + ip + " - " + city + " - " + region + " - " + regionName + " - " + country + " - " + countryCode
                + " - " + latitude + " - " + longitude + " - " + currency + " - " + timezone + " - " + as + " - " + org + " - " + zip
                + " - " + isp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String asn) {
        this.as = asn;
    }

    public String getAsname() { return asname;}

    public void setAsname(String asname) { this.asname = asname;}

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getZip() { return this.zip;}

    public void setZip(String zip) { this.zip = zip;}

    public String getIsp() { return isp;}

    public void setIsp(String isp) { this.isp = isp;}
}
