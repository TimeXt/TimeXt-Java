package guepardoapps.timext.java.extensions;

import java.util.Calendar;

import guepardoapps.timext.java.Interval;

public class CalendarExtensions {
    public static Calendar Add(Calendar calendar, Interval interval) {
        Calendar clone = (Calendar) calendar.clone();
        clone.add(Calendar.MILLISECOND, (int) interval.InMilliSeconds());
        return clone;
    }

    public static Calendar Minus(Calendar calendar, Interval interval) {
        Calendar clone = (Calendar) calendar.clone();
        clone.add(Calendar.MILLISECOND, (int) interval.InMilliSeconds() * -1);
        return clone;
    }
}
