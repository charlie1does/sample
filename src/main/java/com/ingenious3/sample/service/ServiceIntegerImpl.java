package com.ingenious3.sample.service;

import com.ingenious3.sample.api.ServiceInteger;
import com.ingenious3.sample.impl.AbstractInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Function implementing the Service for the integer functionality.
 *
 * User: Charlie
 * Date: 16. 1. 2015
 */
@Service("serviceInteger")
public class ServiceIntegerImpl extends AbstractInteger implements ServiceInteger {

    @Autowired
    @Qualifier("atomicInteger")
    private AtomicInteger atomicInteger;

    @Override
    public Integer function(final Integer argument){
        return atomicInteger.addAndGet(argument);
    }
}
