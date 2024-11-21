package com.mouse.antlr_test.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
public class Compare {
    @Test
    void testUnEqual() {
        log.info("{}", CommonUtil.visit("a=s"));
    }

    @Test
    void testEqual() {
        log.info("{}", CommonUtil.visit("aa=aa"));
    }
}
