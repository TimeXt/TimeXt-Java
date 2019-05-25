package guepardoapps.timext.java.extensions;

import java.util.ArrayList;
import java.util.Locale;

public class LongExtensions {
    public static String formatMilliseconds(long milliseconds) {
        ArrayList<Tuple<String, Tuple<Long, Integer>>> dictionary = new ArrayList<>();
        dictionary.add(new Tuple<>("week", new Tuple<>(7 * 24 * 60 * 60 * 1000L, Integer.MAX_VALUE)));
        dictionary.add(new Tuple<>("day", new Tuple<>(24 * 60 * 60 * 1000L, 7)));
        dictionary.add(new Tuple<>("hour", new Tuple<>(60 * 60 * 1000L, 24)));
        dictionary.add(new Tuple<>("minute", new Tuple<>(60 * 1000L, 60)));
        dictionary.add(new Tuple<>("second", new Tuple<>(1000L, 60)));
        dictionary.add(new Tuple<>("millisecond", new Tuple<>(1L, 1000)));

        ArrayList<String> arrayList = new ArrayList<>();
        dictionary.forEach(value -> {
            long testValue = ((milliseconds / value.second.first) % value.second.second);
            if (testValue > 1) {
                arrayList.add(String.format(Locale.getDefault(), "%d %ss", testValue, value.first));
            } else if (testValue > 0) {
                arrayList.add(String.format(Locale.getDefault(), "%d %s", testValue, value.first));
            }
        });

        if (arrayList.size() > 0) {
            return String.join(", ", arrayList);
        } else {
            return "0 milliseconds";
        }
    }

    public static String formatSeconds(long seconds) {
        ArrayList<Tuple<String, Tuple<Long, Integer>>> dictionary = new ArrayList<>();
        dictionary.add(new Tuple<>("week", new Tuple<>(7 * 24 * 60 * 60L, Integer.MAX_VALUE)));
        dictionary.add(new Tuple<>("day", new Tuple<>(24 * 60 * 60L, 7)));
        dictionary.add(new Tuple<>("hour", new Tuple<>(60 * 60L, 24)));
        dictionary.add(new Tuple<>("minute", new Tuple<>(60L, 60)));
        dictionary.add(new Tuple<>("second", new Tuple<>(1L, 60)));

        ArrayList<String> arrayList = new ArrayList<>();
        dictionary.forEach(value -> {
            long testValue = ((seconds / value.second.first) % value.second.second);
            if (testValue > 1) {
                arrayList.add(String.format(Locale.getDefault(), "%d %ss", testValue, value.first));
            } else if (testValue > 0) {
                arrayList.add(String.format(Locale.getDefault(), "%d %s", testValue, value.first));
            }
        });

        if (arrayList.size() > 0) {
            return String.join(", ", arrayList);
        } else {
            return LongExtensions.formatMilliseconds(1000* seconds);
        }
    }

    public static String formatMinutes(long minutes) {
        ArrayList<Tuple<String, Tuple<Long, Integer>>> dictionary = new ArrayList<>();
        dictionary.add(new Tuple<>("week", new Tuple<>(7 * 24 * 60L, Integer.MAX_VALUE)));
        dictionary.add(new Tuple<>("day", new Tuple<>(24 * 60L, 7)));
        dictionary.add(new Tuple<>("hour", new Tuple<>(60L, 24)));
        dictionary.add(new Tuple<>("minute", new Tuple<>(1L, 60)));

        ArrayList<String> arrayList = new ArrayList<>();
        dictionary.forEach(value -> {
            long testValue = ((minutes / value.second.first) % value.second.second);
            if (testValue > 1) {
                arrayList.add(String.format(Locale.getDefault(), "%d %ss", testValue, value.first));
            } else if (testValue > 0) {
                arrayList.add(String.format(Locale.getDefault(), "%d %s", testValue, value.first));
            }
        });

        if (arrayList.size() > 0) {
            return String.join(", ", arrayList);
        } else {
            return LongExtensions.formatSeconds(60 * minutes);
        }
    }

    public static String formatHours(long hours) {
        ArrayList<Tuple<String, Tuple<Long, Integer>>> dictionary = new ArrayList<>();
        dictionary.add(new Tuple<>("week", new Tuple<>(7 * 24L, Integer.MAX_VALUE)));
        dictionary.add(new Tuple<>("day", new Tuple<>(24L, 7)));
        dictionary.add(new Tuple<>("hour", new Tuple<>(1L, 24)));

        ArrayList<String> arrayList = new ArrayList<>();
        dictionary.forEach(value -> {
            long testValue = ((hours / value.second.first) % value.second.second);
            if (testValue > 1) {
                arrayList.add(String.format(Locale.getDefault(), "%d %ss", testValue, value.first));
            } else if (testValue > 0) {
                arrayList.add(String.format(Locale.getDefault(), "%d %s", testValue, value.first));
            }
        });

        if (arrayList.size() > 0) {
            return String.join(", ", arrayList);
        } else {
            return LongExtensions.formatMinutes(60 * hours);
        }
    }

    private static class Tuple<T, K> {
        final T first;
        final K second;

        Tuple(T first, K second) {
            this.first = first;
            this.second = second;
        }
    }
}
