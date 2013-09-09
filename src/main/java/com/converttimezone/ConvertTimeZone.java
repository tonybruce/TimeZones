

/*Not very happy with this.
Continue exercise
Joda seems a bit hit and miss - investigate
Look at using the timeanddate.com api
Look at using Spark
Focus on TDD
 - Need more tests
Rollout some BDD
 */

package com.converttimezone;

import org.joda.time.DateTime;

import java.util.Scanner;

public class ConvertTimeZone {

    public static void main(String args[]) {

        TimeZoneConverter tzc = new TimeZoneConverter();

        Scanner inputTimeZone = new Scanner(System.in);
        System.out.print("Which timezone would you like to know about? Please use the timezone abbreviation ");

        try {
            DateTime now = DateTime.now();
            String targetTimezone = inputTimeZone.next();
            DateTime convertedTime = tzc.convertDateTimeToTimeZone(now, targetTimezone);

            System.out.println("Current time locally is: " + now);
            System.out.println("Current time at target timezone: " + targetTimezone + " is " + convertedTime);




        } catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


}
}

