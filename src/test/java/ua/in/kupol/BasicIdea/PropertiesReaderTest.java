package ua.in.kupol.BasicIdea;

import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class PropertiesReaderTest extends TestCase {
    static Logger logger = Logger.getLogger(PropertiesReaderTest.class);
    public void testGetReGex() throws Exception{
        //given
        String testActual = new String();

        //when
        PropertiesReader propertiesReader = new PropertiesReader();
        Object testExpected = propertiesReader.getReGex();

        //then
//        try {
            Assert.assertEquals(testExpected.getClass().getName(), testActual.getClass().getName());
//        } catch (ComparisonFailure assertComparisonFailureException){
//        } catch (Exception assertComparisonFailureException){
//            logger.error("Not String " + assertComparisonFailureException, assertComparisonFailureException);
//        }
    }
}