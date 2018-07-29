package com.ingenious3.sample.dto;

import lombok.Value;

@Value(staticConstructor = "of")
public class StringResponse {
    private String value;
    private Class service;
}
