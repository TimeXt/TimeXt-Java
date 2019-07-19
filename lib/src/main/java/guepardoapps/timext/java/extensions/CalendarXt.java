package guepardoapps.timext.java.extensions;

import java.util.Calendar;

import guepardoapps.timext.java.TimeXt;
import guepardoapps.timext.java.TimeXtUnit;

public class CalendarXt {
    public static Calendar Add(Calendar calendar, TimeXt timeXt) {
        Calendar clone = (Calendar) calendar.clone();
        clone.add(Calendar.MILLISECOND, (int) timeXt.InMillis());
        return clone;
    }

    public static Calendar Minus(Calendar calendar, TimeXt timeXt) {
        Calendar clone = (Calendar) calendar.clone();
        clone.add(Calendar.MILLISECOND, (int) timeXt.InMillis() * -1);
        return clone;
    }

    public static TimeXt Minus(Calendar calendar1, Calendar calendar2) {
        return new TimeXt(calendar1.getTimeInMillis() - calendar2.getTimeInMillis(), TimeXtUnit.Millis);
    }
}
