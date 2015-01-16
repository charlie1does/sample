package com.ingenious3.sample.service;

import com.ingenious3.sample.api.ServiceString;
import com.ingenious3.sample.impl.AbstractString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Function implementing the Service for the string functionality.
 *
 * User: Charlie
 * Date: 16. 1. 2015
 */
@Service("serviceString")
public class ServiceStringImpl extends AbstractString implements ServiceString {

    @Value("${argument.string}")
    private String str;

    @Override
    public String function(final String argument){
        return new StringBuffer(argument).append(" ").append(str).toString();
    }
}
