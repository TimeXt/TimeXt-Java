package guepardoapps.timext.java.extensions;

import java.util.ArrayList;
import java.util.Locale;

import guepardoapps.timext.java.TimeXt;
import guepardoapps.timext.java.TimeXtUnit;

public class LongXt {

    public static String formatMilliseconds(long milliseconds) {
        ArrayList<String> arrayList = format(milliseconds, 1.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : "0 milliseconds";
    }

    public static String formatSeconds(long seconds) {
        ArrayList<String> arrayList = format(seconds, 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatMilliseconds(1000 * seconds);
    }

    public static String formatMinutes(long minutes) {
        ArrayList<String> arrayList = format(minutes, 60 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatSeconds(60 * minutes);
    }

    public static String formatHours(long hours) {
        ArrayList<String> arrayList = format(hours, 3600 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatMinutes(60 * hours);
    }

    public static String formatDays(long days) {
        ArrayList<String> arrayList = format(days, 86400 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatHours(24 * days);
    }

    public static String formatWeeks(long weeks) {
        ArrayList<String> arrayList = format(weeks, 604800 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatDays(7 * weeks);
    }

    public static TimeXt toCenturies(long value) {
        return new TimeXt(value, TimeXtUnit.Century);
    }

    public static TimeXt toDecades(long value) {
        return new TimeXt(value, TimeXtUnit.Decade);
    }

    public static TimeXt toYears(long value) {
        return new TimeXt(value, TimeXtUnit.Year);
    }

    public static TimeXt toWeeks(long value) {
        return new TimeXt(value, TimeXtUnit.Week);
    }

    public static TimeXt toDays(long value) {
        return new TimeXt(value, TimeXtUnit.Day);
    }

    public static TimeXt toHours(long value) {
        return new TimeXt(value, TimeXtUnit.Hour);
    }

    public static TimeXt toMinutes(long value) {
        return new TimeXt(value, TimeXtUnit.Minute);
    }

    public static TimeXt toSeconds(long value) {
        return new TimeXt(value, TimeXtUnit.Second);
    }

    public static TimeXt toMillis(long value) { return new TimeXt(value, TimeXtUnit.Millis); }

    public static TimeXt toMicros(long value) { return new TimeXt(value, TimeXtUnit.Micros); }

    public static TimeXt toNanos(long value) {
        return new TimeXt(value, TimeXtUnit.Nanos);
    }

    public static TimeXt toPicos(long value) {
        return new TimeXt(value, TimeXtUnit.Picos);
    }

    private static Tuple[] dictionary = new Tuple[]{
            new Tuple<>("week", new Tuple<>(7 * 24 * 60 * 60 * 1000L, Integer.MAX_VALUE)),
            new Tuple<>("day", new Tuple<>(24 * 60 * 60 * 1000L, 7)),
            new Tuple<>("hour", new Tuple<>(60 * 60 * 1000L, 24)),
            new Tuple<>("minute", new Tuple<>(60 * 1000L, 60)),
            new Tuple<>("second", new Tuple<>(1000L, 60)),
            new Tuple<>("millisecond", new Tuple<>(1L, 1000))
    };

    private static ArrayList<String> format(long value, double divider) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (Tuple<String, Tuple<Long, Integer>> entry : dictionary) {
            double testValue = ((value / (entry.second.first / divider)) % entry.second.second);
            if (testValue > 1) {
                arrayList.add(String.format(Locale.getDefault(), "%f %ss", testValue, entry.first));
            } else if (testValue > 0) {
                arrayList.add(String.format(Locale.getDefault(), "%f %s", testValue, entry.first));
            }
        }

        return arrayList;
    }

    private static class Tuple<T, K> {
        final T first;
        final K second;

        Tuple(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }
}
