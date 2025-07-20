package com.arpajit.holidayplanner.dto;

public class KafkaMessage {
    private String requestType;
    private String sourceService;
    private String timestamp;
    private String payload;

    public KafkaMessage(String requestType,
                              String sourceService,
                              String timestamp,
                              String payload) {
        this.requestType = requestType;
        this.sourceService = sourceService;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public String getRequestType() {return requestType;}
    public String getSourceService() {return sourceService;}
    public String getTimestamp() {return timestamp;}
    public String getPayload() {return payload;}
}
