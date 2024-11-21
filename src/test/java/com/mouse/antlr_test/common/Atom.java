package com.mouse.antlr_test.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Atom {
    @Test
    void test() {
        log.info("{}", CommonUtil.visit("axxx"));

    }
}
