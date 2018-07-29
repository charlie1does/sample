package com.ingenious3.sample.service;

import com.ingenious3.sample.api.IntegerService;
import com.ingenious3.sample.helper.AbstractDefaultContextTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Tests for the Integer Service functionality using the inherited spring context.
 */

public class IntegerIncrementServiceImplContextTest extends AbstractDefaultContextTest {

    @Autowired
    @Qualifier("serviceInteger")
    private IntegerService integerService;

    @Test
    public void testFunctionNull() {
        Assertions.assertThrows(NullPointerException.class,
                ()->{
                    integerService.function(null);
                }
        );
    }

//    @Test
//    public void testFunctionInitialized(){
//        Assertions.assertEquals(new Integer(102),
//                integerService.function(1),
//                "test profile started, expected 101+1"
//        );
//    }
}
