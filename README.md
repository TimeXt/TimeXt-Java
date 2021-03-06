<h1 align="center">
	<img width="90" src="logo.png" alt="timext">
</h1>

<p align="center"><h1 style="text-align: center;">TimeXt-Java</h1></p>

<p align="center">
  <a href="https://www.android.com"><img src="https://img.shields.io/badge/platform-Android-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=26"><img src="https://img.shields.io/badge/API-26+-blue.svg"/></a>
  <a href="https://github.com/TimeXt/TimeXt-Java/tree/0.5.0"><img src="https://img.shields.io/badge/version-0.5.0-blue.svg"/></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg"/></a>
  <a href="http://makeapullrequest.com"><img src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg"/></a>
  <a href="https://github.com/TimeXt/Timext-Java/"><img src="https://img.shields.io/github/stars/TimeXt/Timext-Java.svg"/></a>
</p>

<p align="center"><h6 style="text-align: center;">Support me</h6></p>

<p align="center">
  <a href="https://www.paypal.me/GuepardoApps"><img src="https://img.shields.io/badge/paypal-support-blue.svg"/></a>
</p>

First of all many thanks to [Kizitonwose](https://github.com/kizitonwose/Time) for the original idea and already awesome library!

This library shall help to reduce code like

```java
int dayInMillis = 24 * 60 * 60 * 1000;		// Represent a day in millis
```

## Important

Better use the [Kotlin version](https://github.com/TimeXt/TimeXt-Kotlin/) of this library!

## How to use

### Basics

```java
TimeXt fiveCenturies = DoubleXt.toCenturies(5);
TimeXt tenDecades = DoubleXt.toDecades(10.0);
TimeXt threeYears = DoubleXt.toYears(3.0);
TimeXt oneWeek = IntXt.toWeeks(1);
TimeXt threeDays = LongXt.toDays(3L);
TimeXt elevenHours = DoubleXt.toHours(11.0);
TimeXt sixMinutes = IntXt.toMinutes(6);
TimeXt fiftySeconds = LongXt.toSeconds(50L);
TimeXt hundredMillis = DoubleXt.toMillis(100.0);
TimeXt fiveMicros = IntXt.toMicros(5);
TimeXt oneNano = LongXt.toNanos(1L);
TimeXt onePico = DoubleXt.toPicos(1.0);

double oneDayInMillis = IntXt.toDays(1).InMillis();    		// Converts one day into millis
double twoWeeksInHours = LongXt.toWeeks(2L).InHours();		// Converts two weeks into hours

TimeXt duration = DoubleXt.toDays(1.0).Plus(IntXt.toHours(6));
TimeXt difference = LongXt.toMinutes(34L).Minus(DoubleXt.toSeconds(420.0));
TimeXt multipliedDuration = new TimeXt(4, TimeXtUnit.Week).Times(1.5);
TimeXt dividedDuration = new TimeXt(750, TimeXtUnit.Picos).Div(2.0);

```

### Extensions

```java
// Calendar
Calendar inOneHour = CalendarXt.Add(Calendar.getInstance(), new TimeXt(1, TimeXtUnit.Hour));
Calendar threeDaysAgo = CalendarXt.Minus(Calendar.getInstance(), new TimeXt(3, TimeXtUnit.Day));
TimeXt calendarDifference = CalendarXt.Minus(Calendar calendar1, Calendar calendar2);

// Sql Date
java.sql.Date sqlDate = new java.sql.Date();
sqlDate = DateXt.Add(sqlDate, new TimeXt(30, TimeXtUnit.Second));
sqlDate = DateXt.Minus(sqlDate, new TimeXt(500, TimeXtUnit.Millis));
TimeXt dateDifference = DateXt.Minus(java.sql.Date date1, java.sql.Date date2);

// Util Date
java.util.Date utilDate = new java.util.Date();
utilDate = DateXt.Add(utilDate, new TimeXt(30, TimeXtUnit.Second));
utilDate = DateXt.Minus(utilDate, new TimeXt(500, TimeXtUnit.Millis));
TimeXt dateDifference = DateXt.Minus(java.util.Date date1, java.util.Date date2);

// Timer
Timer timer = new Timer();
TimerTask timerTask = ...;
TimerXt.Schedule(timer, timerTask, new TimeXt(10, TimeXtUnit.Second));
```

The library also includes extensions for Android's Handler class, this is only available if you compile the "lib-android" module.

```java
Handler handler = new Handler()
Runnable runnable = ...;
HandlerXt.PostDelayed(handler, runnable, new TimeXt(2, TimeXtUnit.Minute));
```

Since version 0.3.0 TimeXt has new extensions for the long type to display this number value in a human readable string format.
In version 0.4.0 support for Integer and Double was added as well as the new method formatWeeks.
Since version 0.5.0 TimeXt has values for decades and centuries and  more precise conversions.

```java
val readableStringFromMillis = LongXt.formatMillis(34325055574L) 	// 56 weeks, 5 days, 6 hours, 44 minutes, 15 seconds, 574 milliseconds
val readableStringFromSeconds = LongXt.formatSeconds(4350554L)		// 7 weeks, 1 day, 8 hours, 29 minutes, 14 seconds
val readableStringFromMinutes = LongXt.formatMinutes(432555L)		// 42 weeks, 6 days, 9 hours, 15 minutes
val readableStringFromHours = LongXt.formatHours(4574L)				// 27 weeks, 1 day, 14 hours
val readableStringFromDays = DoubleXt.formatDays(0.75)				// 18 hours
val readableStringFromWeeks = IntXt.formatWeeks(3)					// 3 weeks
```

## Requirements

- Use at least JVM 1.8

## Contributors

| [<img alt="JonasSchubert" src="https://avatars0.githubusercontent.com/u/21952813?v=4&s=117" width="117"/>](https://github.com/JonasSchubert) |
| :---------------------------------------------------------------------------------------------------------------------------------------: |
| [Jonas Schubert](https://github.com/JonasSchubert) |

## License

TimeXt-Java is distributed under the MIT license. [See LICENSE](LICENSE.md) for details.

```
MIT License

Copyright (c) 2018 - 2020 Jonas Schubert

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

## Attention

Migrating from version 0.3.0 or lower to 0.4.0 or upper includes breaking changes.
Class names where shortened from *Extensions to *Xt and unit enum was moved to another package (same as TimeXt) and renamed to TimeXtUnit. 
Furthermore all units smaller the unit second got shortened to *s (millis, micros, picos, nanos).
