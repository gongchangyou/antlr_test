package com.mouse.antlr_test.rule;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
public class Compare {
    @Test
    void testUnEqual() {
        assertEquals(RuleUtil.visit("as = aa"), false);
    }
    @Test
    void testUnEqualStr() {
        assertEquals(RuleUtil.visit("\"as\" = aa"), false);
    }

    @Test
    void testEqual() {
        assertEquals(RuleUtil.visit("aa= aa"), true);
    }

    @Test
    void testEqualAnd() {
        assertEquals(RuleUtil.visit("(aa= aa) AND  (b=b)"), true);
    }
    @Test
    void testUnEqualAND() {
        assertEquals(RuleUtil.visit("(aa= aa) AND  (b=c)"), false);
    }

    @Test
    void testEqualOr() {
        assertEquals(RuleUtil.visit("(aa= aa) OR  (b=c)"), true);
    }
}
