package com.arpajit.holidayplanner.dto;

public class ConsumeMessage {
    private String traceId;
    private String requestType;
    private String sourceService;
    private String timestamp;
    private String payload;
    private String status;
    private String statusResp;

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public void setSourceService(String sourceService) {
        this.sourceService = sourceService;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setStatusResp(String statusResp) {
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
