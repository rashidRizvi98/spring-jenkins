package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(DemoApplication.class);

    @Test
    contextLoads() {
        logger.info("Testcase executed");
        assertEquals(true,true);
    }

}
