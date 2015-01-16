package com.ingenious3.sample.service;

import com.ingenious3.sample.api.Service;
import com.ingenious3.sample.helper.AbstractDefaultContextTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * User: Charlie
 * Date: 16. 1. 2015
 */

public class ServiceIntegerImplContextTest extends AbstractDefaultContextTest {

    @Autowired
    @Qualifier("serviceInteger")
    private Service serviceInteger;

    @Test(expected = IllegalArgumentException.class)
    public void testFunctionNull(){
        serviceInteger.function(null);
    }

    @Test
    public void testFunctionNotInitialized(){
        Assert.assertEquals("test profile started, expected 101+1", new Integer(102), serviceInteger.function(1));
    }
}
