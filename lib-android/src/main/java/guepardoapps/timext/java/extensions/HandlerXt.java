package guepardoapps.timext.java.extensions;

import android.os.Handler;

import guepardoapps.timext.java.TimeXt;

public class HandlerXt {
    public static void PostDelayed(Handler handler, Runnable runnable, TimeXt delay) {
        handler.postDelayed(runnable, Math.round(delay.InMillis()));
    }
}