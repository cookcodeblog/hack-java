[TOC]

# Currency Fomat Locale



```java
public static void main(String[] args) throws Exception {
  Scanner scanner = new Scanner(System.in);
  double payment = scanner.nextDouble();
  scanner.close();

  System.out.println("US: " + formatPayment(payment, Locale.US));
  System.out.println("India: " + formatPayment(payment, new Locale("en", "IN")));
  System.out.println("China: " + formatPayment(payment, Locale.CHINA));
  System.out.println("France: " + formatPayment(payment, Locale.FRANCE));
}

private static String formatPayment(double payment, Locale locale) throws Exception {
  return NumberFormat.getCurrencyInstance(locale).format(payment);
}
```



Refences:

- https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-
- https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-
- https://stackoverflow.com/questions/2544454/get-the-currency-format-for-a-country-that-does-not-have-a-locale-constant



ISO标准参见Wiki：

- Lang: ISO 639 alpha-2 or alpha-3
  - https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
- Country： ISO 3166 alpha-2 country code or a UN M.49 numeric-3 area code
  - https://en.wikipedia.org/wiki/List_of_ISO_3166_country_codes