package guepardoapps.timext.java.extensions;

import java.util.*;

import guepardoapps.timext.java.TimeXt;

public class TimerXt {
    public static void Schedule(Timer timer, TimerTask timerTask, TimeXt period) {
        timer.schedule(timerTask, Math.round(period.InMillis()));
    }

    public static void Schedule(Timer timer, TimerTask timerTask, TimeXt delay, TimeXt period) {
        timer.schedule(timerTask, Math.round(delay.InMillis()), Math.round(period.InMillis()));
    }

    public static void Schedule(Timer timer, TimerTask timerTask, Date firstTime, TimeXt period) {
        timer.schedule(timerTask, firstTime, Math.round(period.InMillis()));
    }

    public static void ScheduleAtFixedRate(Timer timer, TimerTask timerTask, TimeXt delay, TimeXt period) {
        timer.scheduleAtFixedRate(timerTask, Math.round(delay.InMillis()), Math.round(period.InMillis()));
    }

    public static void ScheduleAtFixedRate(Timer timer, TimerTask timerTask, Date firstTime, TimeXt period) {
        timer.scheduleAtFixedRate(timerTask, firstTime, Math.round(period.InMillis()));
    }
}