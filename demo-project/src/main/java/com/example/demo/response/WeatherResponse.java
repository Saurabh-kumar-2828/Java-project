package com.example.demo.response;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
    private Request request;
    private Location location;
    private Current current;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public static class Current {
        @JsonProperty("observation_time")
        private String observationTime;
        private int temperature;
        @JsonProperty("weather_code")
        private int weatherCode;
        @JsonProperty("weather_icons")
        private ArrayList<String> weatherIcons;
        @JsonProperty("weather_descriptions")
        private ArrayList<String> weatherDescriptions;
        @JsonProperty("wind_speed")
        private int windSpeed;
        @JsonProperty("wind_degree")
        private int windDegree;
        @JsonProperty("wind_dir")
        private String windDir;
        private int pressure;
        private int precip;
        private int humidity;
        private int cloudcover;
        private int feelslike;
        @JsonProperty("uv_index")
        private int uvIndex;
        private int visibility;
        @JsonProperty("is_day")
        private String isday;

        public String getObservationTime() {
            return observationTime;
        }

        public void setObservationTime(String observationTime) {
            this.observationTime = observationTime;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(int weatherCode) {
            this.weatherCode = weatherCode;
        }

        public ArrayList<String> getWeatherIcons() {
            return weatherIcons;
        }

        public void setWeatherIcons(ArrayList<String> weatherIcons) {
            this.weatherIcons = weatherIcons;
        }

        public ArrayList<String> getWeatherDescriptions() {
            return weatherDescriptions;
        }

        public void setWeatherDescriptions(ArrayList<String> weatherDescriptions) {
            this.weatherDescriptions = weatherDescriptions;
        }

        public int getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
        }

        public int getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(int windDegree) {
            this.windDegree = windDegree;
        }

        public String getWindDir() {
            return windDir;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getPrecip() {
            return precip;
        }

        public void setPrecip(int precip) {
            this.precip = precip;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(int cloudcover) {
            this.cloudcover = cloudcover;
        }

        public int getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(int feelslike) {
            this.feelslike = feelslike;
        }

        public int getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(int uvIndex) {
            this.uvIndex = uvIndex;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public String getIsday() {
            return isday;
        }

        public void setIsday(String isday) {
            this.isday = isday;
        }
    }

    public static class Location {
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        @JsonProperty("timezone_id")
        private String timezoneId;
        private String localtime;
        @JsonProperty("localtime_epoch")
        private int localtimeEpoch;
        @JsonProperty("utc_offset")
        private String utcOffset;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }

    public static class Request {
        private String type;
        private String query;
        private String language;
        private String unit;
    }
}