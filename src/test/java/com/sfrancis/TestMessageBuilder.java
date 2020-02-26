package com.sfrancis;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }

}
