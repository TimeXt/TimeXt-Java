package guepardoapps.timext.java.extensions;

import guepardoapps.timext.java.TimeXt;
import guepardoapps.timext.java.TimeXtUnit;

public class DateXt {
    public static java.sql.Date Add(java.sql.Date date, TimeXt timeXt) {
        date.setTime(date.getTime() + Math.round(timeXt.InMillis()));
        return date;
    }

    public static java.sql.Date Minus(java.sql.Date date, TimeXt timeXt) {
        date.setTime(date.getTime() - Math.round(timeXt.InMillis()));
        return date;
    }

    public static TimeXt Minus(java.sql.Date date1, java.sql.Date date2) {
        return new TimeXt(date1.getTime() - date2.getTime(), TimeXtUnit.Millis);
    }

    public static java.util.Date Add(java.util.Date date, TimeXt timeXt) {
        date.setTime(date.getTime() + Math.round(timeXt.InMillis()));
        return date;
    }

    public static java.util.Date Minus(java.util.Date date, TimeXt timeXt) {
        date.setTime(date.getTime() - Math.round(timeXt.InMillis()));
        return date;
    }

    public static TimeXt Minus(java.util.Date date1, java.util.Date date2) {
        return new TimeXt(date1.getTime() - date2.getTime(), TimeXtUnit.Millis);
    }
}
