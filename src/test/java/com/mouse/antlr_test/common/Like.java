package com.mouse.antlr_test.common;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Like {
    @Test
    void testNotLike() {
        assertEquals(CommonUtil.visit("a LIKE s"), false);
        assertEquals(CommonUtil.visit("a LIKE %bc"), false);

    }

    @Test
    void testLikeNTimes() {
        StopWatch sw = new StopWatch();
        for (int i=0;i<100;i++) {
            sw.start();

            testNotLike();
            sw.stop();
        }
        System.out.println(sw.prettyPrint());
    }

    @Test
    void testLike() {
        assertEquals(CommonUtil.visit("ack LIKE a%"), true);
        assertEquals(CommonUtil.visit("bac LIKE %a%"), true);
    }
}
