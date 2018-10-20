package guepardoapps.timext.java.extensions;

import java.util.*;

import guepardoapps.timext.java.Interval;

public class TimerExtensions {
    public static void Schedule(Timer timer, TimerTask timerTask, Interval period) {
        timer.schedule(timerTask, Math.round(period.InMilliSeconds()));
    }

    public static void Schedule(Timer timer, TimerTask timerTask, Interval delay, Interval period) {
        timer.schedule(timerTask, Math.round(delay.InMilliSeconds()), Math.round(period.InMilliSeconds()));
    }

    public static void Schedule(Timer timer, TimerTask timerTask, Date firstTime, Interval period) {
        timer.schedule(timerTask, firstTime, Math.round(period.InMilliSeconds()));
    }

    public static void ScheduleAtFixedRate(Timer timer, TimerTask timerTask, Interval delay, Interval period) {
        timer.scheduleAtFixedRate(timerTask, Math.round(delay.InMilliSeconds()), Math.round(period.InMilliSeconds()));
    }

    public static void ScheduleAtFixedRate(Timer timer, TimerTask timerTask, Date firstTime, Interval period) {
        timer.scheduleAtFixedRate(timerTask, firstTime, Math.round(period.InMilliSeconds()));
    }
}