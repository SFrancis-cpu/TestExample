//Test class for MagicBuilder

package com.sfrancis;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

}
