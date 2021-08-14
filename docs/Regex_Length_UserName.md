# Regex Length User Name


```java
private static boolean isValidUserName(String name) {
    String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
    return name.matches(regex);
}

```

说明
- 首字母为英文字母大小写
- 其余部分长度为7到29，由大小写英文字母和数字组成



References:
- https://stackoverflow.com/questions/9043820/regex-to-match-words-of-a-certain-length/9043828
- https://howtodoinjava.com/java/regex/java-regex-validate-the-minmax-length-of-input-text/
- https://stackoverflow.com/questions/12018245/regular-expression-to-validate-username
- https://mkyong.com/regular-expressions/how-to-validate-username-with-regular-expression/

