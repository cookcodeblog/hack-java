[TOC]

# Calendar Day of Week



## Calendar类



```java
import java.util.Calendar;
import java.util.Locale;

private static String getDayOfWeek(int year, int month, int day) {
  Calendar calendar = Calendar.getInstance();
  calendar.set(year, month - 1, day); // Calendar month start from zero
  return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
}
```



## LocalDate类

在Java8后，可以用`java.time.LocalDate`类来实现。



```java
import java.time.LocalDate;

private static String getDayOfWeek2(int year, int month, int day) {
  LocalDate date = LocalDate.of(year, month, day);
  return date.getDayOfWeek().toString().toUpperCase();
}
```





## References

- https://stackoverflow.com/questions/5270272/how-to-determine-day-of-week-by-passing-specific-date