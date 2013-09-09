package com.converttimezone;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TimeZoneConverterTest {

    private TimeZoneConverter timeZoneConverter;

    @Before
    public void setUp(){
        timeZoneConverter = new TimeZoneConverter();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testConvertNowToTimeZoneErrorsOnNull(){
        timeZoneConverter.convertNowToTimeZone(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNowToTimeZoneErrorsOnEmpty(){
        timeZoneConverter.convertNowToTimeZone("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNowToTimeZoneErrorsOnInvalidTimeZone(){
        timeZoneConverter.convertNowToTimeZone("invalid timezone code");
    }

    @Test
    public void testConvertNowToTimeZoneReturnsDatetime(){
        DateTime expected = timeZoneConverter.convertNowToTimeZone("GMT");
        assertNotNull("Expected DateTime should not be null", expected);

    }




}