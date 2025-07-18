package com.arpajit.holidayplanner.dto;

public class ControllerProducer {
    private String requestType;
    private String sourceService;
    private String timestamp;
    private Object payload;

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public void setSourceService(String sourceService) {
        this.sourceService = sourceService;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public void setDaysOfHolidays(Object payload) {
        this.payload = payload;
    }

    public String getRequestType() {return requestType;}
    public String getSourceService() {return sourceService;}
    public String getTimestamp() {return timestamp;}
    public Object getDaysOfHolidays() {return payload;}
}
