package com.mouse.antlr_test.rule;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 复杂语句解析  0.15ms 低于0.2ms
 */
@Slf4j
@SpringBootTest
public class Complex {
    @Test
    void test() {
        StopWatch sw = new StopWatch();
        for (int i=0;i<100;i++) {
            sw.start();

            RuleUtil.visit("ab LIKE a% and a in [a, b,c,d] and c=c");
            sw.stop();
        }
        System.out.println(sw.prettyPrint());
    }
}
