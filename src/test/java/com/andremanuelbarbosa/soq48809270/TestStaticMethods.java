package com.andremanuelbarbosa.soq48809270;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyStaticMethodClass.class)
public class TestStaticMethods {

    @Test
    public void testMyStatic() {

        PowerMockito.mockStatic(MyStaticMethodClass.class);
        Mockito.when(MyStaticMethodClass.getString()).thenReturn("Hello World");

        String result = MyStaticMethodClass.getString();

        Assert.assertEquals("Hello World", result);
    }
}
