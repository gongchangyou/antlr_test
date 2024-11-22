package com.mouse.antlr_test.rule;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
public class In {
    @Test
    void testNotIn() {
        assertEquals(RuleUtil.visit("as IN [aa,bb]"), false);
    }

    @Test
    void testIn() {
        assertEquals(RuleUtil.visit("as IN [aa,as, bb]"), true);
    }

}
