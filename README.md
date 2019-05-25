# TimeXt-Java

[![Platform](https://img.shields.io/badge/platform-Android-blue.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-26+-blue.svg)](https://android-arsenal.com/api?level=26)

[![Version](https://img.shields.io/badge/version-0.3.0-blue.svg)](https://github.com/TimeXt/TimeXt-Java/tree/0.3.0)
[![Build](https://img.shields.io/badge/buildJava-success-green.svg)](releases/lib-2019-05-02-1.jar)

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Paypal](https://img.shields.io/badge/paypal-donate-blue.svg)](https://www.paypal.me/GuepardoApps)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)

First of all many thanks to [Kizitonwose](https://github.com/kizitonwose/Time) for the original idea and already awesome library!

This library shall help to reduce code like

```java
int dayInMillis = 24 * 60 * 60 * 1000;		// Represent a day in milliSeconds
```

## Important

Better use the [Kotlin version](https://github.com/TimeXt/TimeXt-Kotlin/) of this library!

## How to use

### Basics

```java
Interval threeYears = NumberExtensions.toYears(3);
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
double twoWeeksInHours = NumberExtensions.toWeeks(2).InHours();			// Converts two weeks into hours

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

Since version 0.3.0 TimeXt has new extensions for the long type to display this number value in a human readable string format.

```java
val readableStringFromMilliseconds = LongExtensions.formatMilliseconds(34325055574) // 56 weeks, 5 days, 6 hours, 44 minutes, 15 seconds, 574 milliseconds
val readableStringFromSeconds = LongExtensions.formatSeconds(4350554) 				// 7 weeks, 1 day, 8 hours, 29 minutes, 14 seconds
val readableStringFromMinutes = LongExtensions.formatMinutes(432555) 				// 42 weeks, 6 days, 9 hours, 15 minutes
val readableStringFromHours = LongExtensions.formatHours(4574) 						// 27 weeks, 1 day, 14 hours
```

## Requirements

- Use at least JVM 1.8

## License

TimeXt-Java is distributed under the MIT license. [See LICENSE](LICENSE.md) for details.

```
MIT License

Copyright (c) 2018 - 2019 GuepardoApps (Jonas Schubert)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
