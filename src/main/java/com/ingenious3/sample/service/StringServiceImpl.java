package com.ingenious3.sample.service;

import com.ingenious3.sample.api.StringService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Class implements the string service functionality.
 */
@Service("serviceString")
public final class StringServiceImpl implements StringService {

    @Value("${argument.string}")
    private String str;

    @Override
    public String function(final String argument){
        return new StringBuffer(argument).append(" ").append(str).toString();
    }
}
