package com.converttimezone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TimeZoneConverter {

    public DateTime convertDateTimeToTimeZone(DateTime theDate, String theTimeZone){
      if(theDate == null){
          throw new IllegalArgumentException("DateTime theDate cannot be null");
      }

      if(theTimeZone == null || theTimeZone.isEmpty()){
          throw new IllegalArgumentException("String theTimeZone cannot be null or empty");
      }

      return new DateTime(theDate, DateTimeZone.forID(theTimeZone));
    }

    public DateTime convertNowToTimeZone(String theTimeZone){

        if(theTimeZone == null || theTimeZone.isEmpty()){
            throw new IllegalArgumentException("String theTimeZone cannot be null or empty");
        }
        return convertDateTimeToTimeZone(DateTime.now(), theTimeZone);
    }
}
