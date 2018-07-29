package com.ingenious3.sample.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for the Integer Service functionality running without the spring context.
 */
public class IntegerIncrementServiceImplUnitTest {

    @Test
    public void testFunctionNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->{
            new IntegerIncrementServiceImpl().function(null);
            }
        );
    }

    @Test
    public void testFunctionNotInitialized() throws NullPointerException {
        Assertions.assertThrows(NullPointerException.class,
                ()->{
                    new IntegerIncrementServiceImpl().function(1);
                }
        );
    }
}
