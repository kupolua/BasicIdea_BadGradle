package ua.in.kupol.BasicIdea;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesReaderTest {

    @Test
    public void testGetReGex() throws Exception {
        //given
        String testActual = new String();

        //when
        PropertiesReader propertiesReader = new PropertiesReader();
        Object testExpected = propertiesReader.getReGex();

        //then
        Assert.assertEquals(testExpected.getClass().getName(), testActual.getClass().getName());

    }
}