package com.ingenious3.sample.dto;

import lombok.Value;

@Value(staticConstructor = "of")
public class IntegerResponse {
    private Integer value;
    private Class service;
}
