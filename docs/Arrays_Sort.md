# Arrays Sort


Simple case:
```java
// ASC order
Arrays.sort(s);

// reversed, DESC order
Arrays.sort(s, Comparator.reverseOrder());

```

BigDecimal:
```java
// ASC order
Arrays.sort(s, (o1, o2) -> new BigDecimal(o1).compareTo(new BigDecimal(o2)));

// reverse, DESC order
Arrays.sort(s, (o1, o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1)));
```

Big Decimal with null and empty string:
```java
Arrays.sort(s, (o1, o2) -> {
    if ((o1 != null && !o1.isEmpty()) &&
            (o2 != null && !o2.isEmpty())) {
        return new BigDecimal(o2).compareTo(new BigDecimal(o1));
    }
    return 0;
});
```