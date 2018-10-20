package guepardoapps.timext.java.extensions;

import android.os.Handler;

import guepardoapps.timext.java.Interval;

public class HandlerExtensions {
    public static void PostDelayed(Handler handler, Runnable runnable, Interval delay) {
        handler.postDelayed(runnable, Math.round(delay.InMilliSeconds()));
    }
}