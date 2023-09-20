package edu.wgu.d387_sample_code.model.response;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeResponse {

    private static String time;

    public void TimeResponse() {
    }

    public void TimeResponse(String time) {
       this.time = time;
    }
    public static void getTimeResponse()  {
        ZoneId zEastern=ZoneId.of("America/New_York");
        ZoneId zMountain=ZoneId.of("America/Denver");
        ZoneId zUTC=ZoneId.of("UTC");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");

        ZonedDateTime zonedDateTime = ZonedDateTime.parse(
                "2013-10-11T16:30:00.123+00:00[UTC]");;

        ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
        ZonedDateTime zonedDateTimeMountain = zonedDateTime.withZoneSameInstant(zMountain);
        ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUTC);


        time = "UTC time: " + zonedDateTimeUTC.format(formatter)
                + " | Eastern time: " + zonedDateTimeEastern.format(formatter)
                + " | Mountain time: " + zonedDateTimeMountain.format(formatter);
    }

    public String getTime() {
        return time;
    }

}
