package com.mouse.antlr_test.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
public class Compare {
    @Test
    void testUnEqual() {
        assertEquals(CommonUtil.visit("as = aa"), false);
    }
    @Test
    void testUnEqualStr() {
        assertEquals(CommonUtil.visit("\"as\" = aa"), false);
    }

    @Test
    void testEqual() {
        assertEquals(CommonUtil.visit("aa= aa"), true);
    }
}
