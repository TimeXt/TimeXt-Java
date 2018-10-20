package guepardoapps.timext.java.extensions;

import guepardoapps.timext.java.Interval;

public class DateExtensions {
    public static java.sql.Date Add(java.sql.Date date, Interval interval) {
        date.setTime(date.getTime() + Math.round(interval.InMilliSeconds()));
        return date;
    }

    public static java.sql.Date Minus(java.sql.Date date, Interval interval) {
        date.setTime(date.getTime() - Math.round(interval.InMilliSeconds()));
        return date;
    }

    public static java.util.Date Add(java.util.Date date, Interval interval) {
        date.setTime(date.getTime() + Math.round(interval.InMilliSeconds()));
        return date;
    }

    public static java.util.Date Minus(java.util.Date date, Interval interval) {
        date.setTime(date.getTime() - Math.round(interval.InMilliSeconds()));
        return date;
    }
}
