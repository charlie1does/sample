package com.ingenious3.sample.service;

import org.junit.Test;

/**
 * User: Charlie
 * Date: 16. 1. 2015
 */
public class ServiceIntegerImplUnitTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFunctionNull(){
        new ServiceIntegerImpl().function(null);
    }

    @Test(expected = NullPointerException.class)
    public void testFunctionNotInitialized(){
        new ServiceIntegerImpl().function(1);
    }
}
