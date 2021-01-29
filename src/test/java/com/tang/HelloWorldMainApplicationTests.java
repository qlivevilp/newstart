package com.tang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: create by shujuan.tang
 * @description: com.tang
 * @date:2021/1/20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldMainApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        logger.trace("this is trace log");
        logger.debug("this is debug log");
        logger.info("this is info log");
        logger.warn("this is warn log");
        logger.error("this is error log");

    }

}
