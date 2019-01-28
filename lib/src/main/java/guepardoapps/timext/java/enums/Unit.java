package guepardoapps.timext.java.enums;

public enum Unit {
    Year(365 * 24.0 * 60.0 * 60.0),
    Week(7 * 24.0 * 60.0 * 60.0),
    Day(24.0 * 60.0 * 60.0),
    Hour(60.0 * 60.0),
    Minute(60.0),
    Second(1),
    MilliSecond(1e-3),
    MicroSecond(1e-6),
    NanoSecond(1e-9),
    PicoSecond(1e-12);

    Unit(double conversion) {
        this.conversion = conversion;
    }

    public double conversion;
}
