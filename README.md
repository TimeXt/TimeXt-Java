# TimeXt-Java - develop branch

[![Platform](https://img.shields.io/badge/platform-Android-blue.svg)](https://www.android.com)
<a target="_blank" href="https://android-arsenal.com/api?level=14" title="API14+"><img src="https://img.shields.io/badge/API-14+-blue.svg" /></a>
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
<a target="_blank" href="https://www.paypal.me/GuepardoApps" title="Donate using PayPal"><img src="https://img.shields.io/badge/paypal-donate-blue.svg" /></a>

[![Build](https://img.shields.io/badge/build-success-green.svg)](https://github.com/TimeXt/TimeXt-Java/blob/develop/releases/lib-2018-10-20-1.aar)
[![Version](https://img.shields.io/badge/version-v0.1.0.181020-blue.svg)](https://github.com/TimeXt/TimeXt-Java/tree/develop/releases/)

First of all many thanks to [Kizitonwose](https://github.com/kizitonwose/Time) for the original idea and already awesome library!

This library shall help to reduce code like

```java
int dayInMillis = 24 * 60 * 60 * 1000;                                  // Represent a day in milliSeconds
```

## How to use

### Basics

```java
Interval oneWeek = NumberExtensions.toWeeks(1);
Interval threeDays = NumberExtensions.toDays(3);
Interval elevenHours = NumberExtensions.toHours(11);
Interval sixMinutes = NumberExtensions.toMinutes(6);
Interval fiftySeconds = NumberExtensions.toSeconds(50);
Interval hundredMilliSeconds = NumberExtensions.toMilliSeconds(100);
Interval fiveMicroSeconds = NumberExtensions.toMicroSeconds(5);
Interval oneNanoSecond = NumberExtensions.toNanoSeconds(1);
Interval onePicoSecond = NumberExtensions.toPicoSeconds(1);

double oneDayInMillis = NumberExtensions.toDays(1).InMilliSeconds();    // Converts one day into milliseconds
double twoWeeksInHours = NumberExtensions.toWeeks(2).InHours();         // Converts two weeks into hours

Interval duration = NumberExtensions.toDays(1).Plus(NumberExtensions.toHours(6));
Interval difference = NumberExtensions.toMinutes(34).Minus(NumberExtensions.toSeconds(420));
Interval multipliedDuration = new Interval(4, Unit.Week).Times(1.5);
Interval dividedDuration = new Interval(750, Unit.PicoSecond).Div(2.0);

```

### Extensions

```java
// Calendar
Calendar inOneHour = CalendarExtensions.Add(Calendar.getInstance(), new Interval(1, Unit.Hour));
Calendar threeDaysAgo = CalendarExtensions.Minus(Calendar.getInstance(), new Interval(3, Unit.Day));

// Sql Date
java.sql.Date sqlDate = new java.sql.Date();
sqlDate = DateExtensions.Add(sqlDate, new Interval(30, Unit.Second));
sqlDate = DateExtensions.Minus(sqlDate, new Interval(500, Unit.MilliSecond));

// Util Date
java.util.Date utilDate = new java.util.Date();
utilDate = DateExtensions.Add(utilDate, new Interval(30, Unit.Second));
utilDate = DateExtensions.Minus(utilDate, new Interval(500, Unit.MilliSecond));

// Timer
Timer timer = new Timer();
TimerTask timerTask = ...;
TimerExtensions.Schedule(timer, timerTask, new Interval(10, Unit.Second));
```

The library also includes extensions for Android's Handler class, this is only available if you compile the "lib-android" module.

```java
Handler handler = new Handler()
Runnable runnable = ...;
HandlerExtensions.PostDelayed(handler, runnable, new Interval(2, Unit.Minute));
```

## Requirements

- Use at least JVM 1.8

## License

TimeXt-Java is distributed under the MIT license. [See LICENSE](https://github.com/TimeXt/TimeXt-Java/blob/develop/LICENSE.md) for details.

## Additional

Better use the [Kotlin version](https://github.com/TimeXt/TimeXt-Kotlin/) of this library!
