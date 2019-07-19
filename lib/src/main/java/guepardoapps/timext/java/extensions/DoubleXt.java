package guepardoapps.timext.java.extensions;

import java.util.ArrayList;
import java.util.Locale;

import guepardoapps.timext.java.TimeXtUnit;
import guepardoapps.timext.java.TimeXt;

public class DoubleXt {

    public static String formatMilliseconds(double milliseconds) {
        ArrayList<String> arrayList = format(milliseconds, 1.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : "0 milliseconds";
    }

    public static String formatSeconds(double seconds) {
        ArrayList<String> arrayList = format(seconds, 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatMilliseconds(1000 * seconds);
    }

    public static String formatMinutes(double minutes) {
        ArrayList<String> arrayList = format(minutes, 60 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatSeconds(60 * minutes);
    }

    public static String formatHours(double hours) {
        ArrayList<String> arrayList = format(hours, 60 * 60 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatMinutes(60 * hours);
    }

    public static String formatDays(double days) {
        ArrayList<String> arrayList = format(days, 24 * 60 * 60 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatHours(24 * days);
    }

    public static String formatWeeks(double weeks) {
        ArrayList<String> arrayList = format(weeks, 7 * 24 * 60 * 60 * 1000.0);
        return arrayList.size() > 0 ? String.join(", ", arrayList) : formatDays(7 * weeks);
    }

    public static TimeXt toYears(double value) {
        return new TimeXt(value, TimeXtUnit.Year);
    }

    public static TimeXt toWeeks(double value) {
        return new TimeXt(value, TimeXtUnit.Week);
    }

    public static TimeXt toDays(double value) {
        return new TimeXt(value, TimeXtUnit.Day);
    }

    public static TimeXt toHours(double value) {
        return new TimeXt(value, TimeXtUnit.Hour);
    }

    public static TimeXt toMinutes(double value) {
        return new TimeXt(value, TimeXtUnit.Minute);
    }

    public static TimeXt toSeconds(double value) {
        return new TimeXt(value, TimeXtUnit.Second);
    }

    public static TimeXt toMillis(double value) { return new TimeXt(value, TimeXtUnit.Millis); }

    public static TimeXt toMicros(double value) { return new TimeXt(value, TimeXtUnit.Micros); }

    public static TimeXt toNanos(double value) {
        return new TimeXt(value, TimeXtUnit.Nanos);
    }

    public static TimeXt toPicos(double value) {
        return new TimeXt(value, TimeXtUnit.Picos);
    }

    private static Tuple[] dictionary = new Tuple[]{
            new Tuple<>("week", new Tuple<>(7 * 24 * 60 * 60 * 1000.0, Integer.MAX_VALUE)),
            new Tuple<>("day", new Tuple<>(24 * 60 * 60 * 1000.0, 7)),
            new Tuple<>("hour", new Tuple<>(60 * 60 * 1000.0, 24)),
            new Tuple<>("minute", new Tuple<>(60 * 1000.0, 60)),
            new Tuple<>("second", new Tuple<>(1000.0, 60)),
            new Tuple<>("millisecond", new Tuple<>(1.0, 1000))
    };

    private static ArrayList<String> format(double value, double divider) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (Tuple<String, Tuple<Double, Integer>> entry : dictionary) {
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
