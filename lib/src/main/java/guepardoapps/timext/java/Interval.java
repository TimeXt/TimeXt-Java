package guepardoapps.timext.java;

import guepardoapps.timext.java.enums.Unit;

public class Interval {

    private double value;

    public double GetValue() {
        return this.value;
    }

    private Unit unit;

    public Unit GetUnit() {
        return this.unit;
    }

    public Interval(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double InWeeks() {
        return this.value * this.unit.conversion / Unit.Week.conversion;
    }

    public double InDays() {
        return this.value * this.unit.conversion / Unit.Day.conversion;
    }

    public double InHours() {
        return this.value * this.unit.conversion / Unit.Hour.conversion;
    }

    public double InMinutes() {
        return this.value * this.unit.conversion / Unit.Minute.conversion;
    }

    public double InSeconds() {
        return this.value * this.unit.conversion / Unit.Second.conversion;
    }

    public double InMilliSeconds() {
        return this.value * this.unit.conversion / Unit.MilliSecond.conversion;
    }

    public double InMicroSeconds() {
        return this.value * this.unit.conversion / Unit.MicroSecond.conversion;
    }

    public double InNanoSeconds() {
        return this.value * this.unit.conversion / Unit.NanoSecond.conversion;
    }

    public double InPicoSeconds() {
        return this.value * this.unit.conversion / Unit.PicoSecond.conversion;
    }

    public Interval Plus(Interval interval) {
        this.value = ((this.InPicoSeconds() + interval.InPicoSeconds()) / this.unit.conversion) * Unit.PicoSecond.conversion;
        return this;
    }

    public Interval Minus(Interval interval) {
        this.value = ((this.InPicoSeconds() - interval.InPicoSeconds()) / this.unit.conversion) * Unit.PicoSecond.conversion;
        return this;
    }

    public Interval Times(double timesValue) {
        this.value *= timesValue;
        return this;
    }

    public Interval Div(double diversionValue) {
        if (diversionValue == 0) {
            throw new ArithmeticException("Diversion value may not be 0!");
        }
        this.value /= diversionValue;
        return this;
    }

    public Interval Inc(Interval interval) {
        this.value++;
        return this;
    }

    public Interval Dec(Interval interval) {
        this.value--;
        return this;
    }

    public int CompareTo(Interval interval) {
        return (int) (this.InMilliSeconds() - interval.InMilliSeconds());
    }

    public boolean Contains(Interval interval) {
        return this.InPicoSeconds() >= interval.InPicoSeconds();
    }

    public boolean Equals(Interval interval) {
        if (interval == null) {
            return false;
        }
        return this.CompareTo(interval) == 0;
    }

    public int HashCode() {
        return (int) this.InPicoSeconds();
    }
}
