package com.mouse.antlr_test.common;

import org.junit.jupiter.api.Test;

public class Like {
    @Test
    void test() {
        CommonUtil.visit("a LIKE s;");
    }
}
