package com.ingenious3.sample.helper;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Generic class for allowing the spring context in tests.
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:app-context.xml"})
public abstract class AbstractDefaultContextTest {
}
