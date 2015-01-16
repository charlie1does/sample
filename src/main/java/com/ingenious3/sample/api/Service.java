package com.ingenious3.sample.api;

/**
 * Service interface providing functionality for a generic type.
 *
 * User: Charlie
 * Date: 16. 1. 2015
 */
public interface Service<T> {

    /**
     * Function working based on the passed argument.
     * @param argument is a valid argument
     * @return a modified copy of the argument
     */
    T function(final T argument);
}
