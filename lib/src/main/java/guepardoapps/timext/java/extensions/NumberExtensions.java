package guepardoapps.timext.java.extensions;

import guepardoapps.timext.java.enums.Unit;
import guepardoapps.timext.java.Interval;

public class NumberExtensions {
    public static Interval toWeeks(double value) {
        return new Interval(value, Unit.Week);
    }

    public static Interval toDays(double value) {
        return new Interval(value, Unit.Day);
    }

    public static Interval toHours(double value) {
        return new Interval(value, Unit.Hour);
    }

    public static Interval toMinutes(double value) {
        return new Interval(value, Unit.Minute);
    }

    public static Interval toSeconds(double value) {
        return new Interval(value, Unit.Second);
    }

    public static Interval toMilliSeconds(double value) {
        return new Interval(value, Unit.MilliSecond);
    }

    public static Interval toMicroSeconds(double value) {
        return new Interval(value, Unit.MicroSecond);
    }

    public static Interval toNanoSeconds(double value) {
        return new Interval(value, Unit.NanoSecond);
    }

    public static Interval toPicoSeconds(double value) {
        return new Interval(value, Unit.PicoSecond);
    }
}
