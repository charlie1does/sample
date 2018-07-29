package com.ingenious3.sample.api;

/**
 * AppService interface provides functionality for a generic type.
 */
public interface AppService<T> {

    /**
     * Function working based on the passed argument.
     * @param argument is a valid argument
     * @return a modified copy of the argument
     */
    default T function(final T argument){
        throw new UnsupportedOperationException("The requested operation is not supported!");
    }
}
