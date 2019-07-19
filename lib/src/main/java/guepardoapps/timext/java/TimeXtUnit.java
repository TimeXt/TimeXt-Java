package guepardoapps.timext.java;

public enum TimeXtUnit {
    Year(365 * 24.0 * 60.0 * 60.0),
    Week(7 * 24.0 * 60.0 * 60.0),
    Day(24.0 * 60.0 * 60.0),
    Hour(60.0 * 60.0),
    Minute(60.0),
    Second(1),
    Millis(1e-3),
    Micros(1e-6),
    Nanos(1e-9),
    Picos(1e-12);

    TimeXtUnit(double conversion) {
        this.conversion = conversion;
    }

    public double conversion;
}
