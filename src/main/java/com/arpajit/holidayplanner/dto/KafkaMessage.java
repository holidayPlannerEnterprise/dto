package com.arpajit.holidayplanner.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KafkaMessage {
    private String traceId;
    private String requestType;
    private String sourceService;
    private String timestamp;
    private String status;
    private String statusResp;

    @JsonCreator
    public KafkaMessage(@JsonProperty("traceId") String traceId,
                        @JsonProperty("requestType") String requestType,
                        @JsonProperty("sourceService") String sourceService,
                        @JsonProperty("timestamp") String timestamp,
                        @JsonProperty("status") String status,
                        @JsonProperty("statusResp") String statusResp) {
        this.traceId = traceId;
        this.requestType = requestType;
        this.sourceService = sourceService;
        this.timestamp = timestamp;
        this.status = status;
        this.statusResp = statusResp;
    }

    public void setTraceId(String traceId) {this.traceId = traceId;}
    public void setRequestType(String requestType) {this.requestType = requestType;}
    public void setSourceService(String sourceService) {this.sourceService = sourceService;}
    public void setTimestamp(String timestamp) {this.timestamp = timestamp;}
    public void setStatus(String status) {this.status = status;}
    public void setStatusResp(String statusResp) {this.statusResp = statusResp;}

    public String getTraceId() {return traceId;}
    public String getRequestType() {return requestType;}
    public String getSourceService() {return sourceService;}
    public String getTimestamp() {return timestamp;}
    public String getStatus() {return status;}
    public String getStatusResp() {return statusResp;}
}
