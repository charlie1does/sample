package com.ingenious3.sample.service;

import com.ingenious3.sample.api.IntegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Class implements the integer service functionality.
 */
@Service("serviceInteger")
public final class IntegerIncrementServiceImpl implements IntegerService {

    @Autowired
    @Qualifier("atomicInteger")
    private AtomicInteger atomicInteger;

    @Override
    public Integer function(final Integer argument){
        if(argument == null){
            throw new IllegalArgumentException("Argument must not be null!");
        }
        return atomicInteger.addAndGet(argument);
    }
}
