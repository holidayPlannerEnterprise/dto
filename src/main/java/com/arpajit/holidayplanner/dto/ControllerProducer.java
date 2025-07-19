package com.arpajit.holidayplanner.dto;

public class ControllerProducer {
    private String requestType;
    private String sourceService;
    private String timestamp;
    private Object payload;

    public ControllerProducer(String requestType,
                              String sourceService,
                              String timestamp,
                              Object payload) {
        this.requestType = requestType;
        this.sourceService = sourceService;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public String getRequestType() {return requestType;}
    public String getSourceService() {return sourceService;}
    public String getTimestamp() {return timestamp;}
    public Object getPayload() {return payload;}
}
