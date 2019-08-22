### Welcome to IP API for Volley 
[![](https://jitpack.io/v/SperoApps/location-info-volley.svg)](https://jitpack.io/#SperoApps/location-info-volley)

This is a wrapper of [IP-API](http://ip-api.com/json) for Android platform using Volley.
In simple words, get your location information by IP address.

### Sample Application
Sample Application is included in [app](https://github.com/SperoApps/location-info-volley/tree/master/app)

### How to install

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.SperoApps:location-info-volley:1.0.0'
	}
	
### How to use
       InfoManager apiManager = new InfoManager(Volley.newRequestQueue(this));
       apiManager.getGeoIpInfo(response -> {
            //This is how you get the information.
            Log.i("All Responses", "onResponse: " + response.messageToString() );
            String country = response.getCountry();
            String city = response.getCity();
            String countryCode = response.getCountryCode();
            double latitude = response.getLatitude();
            double longtidue = response.getLongitude();
            String region = response.getRegion();
            String timezone = response.getTimezone();
            String isp = response.getIsp();
        }, error -> {
            String errorMessage = error.toString();
        });

