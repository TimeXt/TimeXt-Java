package guepardoapps.timext.java;

public enum TimeXtUnit {
    Century(3155760000.0 * 1e3),
    Decade(315576000.0 * 1e3),
    Year(31557600.0 * 1e3),
    Week(604800.0 * 1e3),
    Day(86400.0 * 1e3),
    Hour(3600.0 * 1e3),
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
