[TOC]

# String to Camel Case

```java
private static String toCamelCase(String s) {
    if (s == null || s.isEmpty()) {
        return s;
    }
    if (s.length() == 1) {
        return s.toUpperCase();
    }
    return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
}

```

References:
- https://stackoverflow.com/questions/1143951/what-is-the-simplest-way-to-convert-a-java-string-from-all-caps-words-separated
- https://www.baeldung.com/java-string-title-case