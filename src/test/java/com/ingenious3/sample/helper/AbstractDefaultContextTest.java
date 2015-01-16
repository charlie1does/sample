package com.ingenious3.sample.helper;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: Charlie
 * Date: 16. 1. 2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/webContext.xml"})
public abstract class AbstractDefaultContextTest {
}
