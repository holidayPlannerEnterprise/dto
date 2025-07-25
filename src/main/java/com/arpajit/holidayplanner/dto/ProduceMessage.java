package com.arpajit.holidayplanner.dto;

public class ProduceMessage {
    private String traceId;
    private String requestType;
    private String sourceService;
    private String timestamp;
    private String payload;
    private String status;
    private String statusResp;

    public ProduceMessage(String traceId,
                            String requestType,
                            String sourceService,
                            String timestamp,
                            String payload,
                            String status,
                            String statusResp) {
        this.traceId = traceId;
        this.requestType = requestType;
        this.sourceService = sourceService;
        this.timestamp = timestamp;
        this.payload = payload;
        this.status = status;
        this.statusResp = statusResp;
    }

    public String getTraceId() {return traceId;}
    public String getRequestType() {return requestType;}
    public String getSourceService() {return sourceService;}
    public String getTimestamp() {return timestamp;}
    public String getPayload() {return payload;}
    public String getStatus() {return status;}
    public String getStatusResp() {return statusResp;}
}
