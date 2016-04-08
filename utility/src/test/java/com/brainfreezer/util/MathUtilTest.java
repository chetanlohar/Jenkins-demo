package com.brainfreezer.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wunderkinds on 08-04-2016.
 */
public class MathUtilTest {

    @Test
    public void testAdd() throws Exception {
        System.out.println("Testing add()...");
        Assert.assertEquals(new MathUtil().add(5,5),10);
    }
}