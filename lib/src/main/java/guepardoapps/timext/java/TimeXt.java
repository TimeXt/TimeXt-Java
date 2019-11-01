package guepardoapps.timext.java;

public class TimeXt {

    private double value;

    public double GetValue() {
        return this.value;
    }

    private TimeXtUnit unit;

    public TimeXtUnit GetUnit() {
        return this.unit;
    }

    public TimeXt(double value, TimeXtUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double InCenturies() { return this.value * this.unit.conversion / TimeXtUnit.Century.conversion; }

    public double InDecades() { return this.value * this.unit.conversion / TimeXtUnit.Decade.conversion; }

    public double InYears() { return this.value * this.unit.conversion / TimeXtUnit.Year.conversion; }

    public double InWeeks() { return this.value * this.unit.conversion / TimeXtUnit.Week.conversion; }

    public double InDays() {
        return this.value * this.unit.conversion / TimeXtUnit.Day.conversion;
    }

    public double InHours() { return this.value * this.unit.conversion / TimeXtUnit.Hour.conversion; }

    public double InMinutes() { return this.value * this.unit.conversion / TimeXtUnit.Minute.conversion; }

    public double InSeconds() { return this.value * this.unit.conversion / TimeXtUnit.Second.conversion; }

    public double InMillis() { return this.value * this.unit.conversion / TimeXtUnit.Millis.conversion; }

    public double InMicros() { return this.value * this.unit.conversion / TimeXtUnit.Micros.conversion; }

    public double InNanos() { return this.value * this.unit.conversion / TimeXtUnit.Nanos.conversion; }

    public double InPicos() { return this.value * this.unit.conversion / TimeXtUnit.Picos.conversion; }

    public TimeXt Plus(TimeXt timeXt) {
        this.value = ((this.InPicos() + timeXt.InPicos()) / this.unit.conversion) * TimeXtUnit.Picos.conversion;
        return this;
    }

    public TimeXt Minus(TimeXt timeXt) {
        this.value = ((this.InPicos() - timeXt.InPicos()) / this.unit.conversion) * TimeXtUnit.Picos.conversion;
        return this;
    }

    public TimeXt Times(double value) {
        this.value *= value;
        return this;
    }

    public TimeXt Div(double value) {
        if (value == 0) {
            throw new ArithmeticException("Diversion value may not be 0!");
        }
        this.value /= value;
        return this;
    }

    public TimeXt Inc() {
        this.value++;
        return this;
    }

    public TimeXt Dec() {
        this.value--;
        return this;
    }

    public int CompareTo(TimeXt interval) { return (int) (this.InPicos() - interval.InPicos()); }

    public boolean Contains(TimeXt interval) { return this.InPicos() >= interval.InPicos();  }

    public boolean Equals(TimeXt interval) { return interval != null && this.CompareTo(interval) == 0; }

    public int HashCode() {
        return (int) this.InPicos();
    }
}
