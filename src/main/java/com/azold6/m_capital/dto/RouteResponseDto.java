package com.azold6.m_capital.dto;

public class RouteResponseDto {

    private String source;
    private String target;
    private Integer distance;

    public RouteResponseDto(String source, String target, Integer distance) {
        this.source = source;
        this.target = target;
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
