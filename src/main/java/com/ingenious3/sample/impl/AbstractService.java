package com.ingenious3.sample.impl;

import com.ingenious3.sample.api.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract function providing a functionality.
 *
 * User: Charlie
 * Date: 16. 1. 2015
 */
public abstract class AbstractService<T> implements Service<T> {

    private final Logger LOG = LoggerFactory.getLogger(AbstractService.class);

    @Override
    public T function(T argument) {
        LOG.error("Invalid call, function not implemented in this type.");
        throw new UnsupportedOperationException("The operation is not supported!");
    }
}
