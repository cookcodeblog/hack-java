[TOC]

# String Split Tokens



```java
private static String[] getTokens(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }
        String[] tokens = s.trim().split("[^a-zA-Z]+"); // or [^A-Za-z]+
        if (tokens != null && tokens.length > 0 ) {
            if (tokens[0].isEmpty()) {
                return Arrays.copyOfRange(tokens, 1, tokens.length);
            } else {
                return tokens;
            }
        }
        return new String[0];
    }
```



正则表达式，用了`[]` 后，不用在用`|` 来表达or。

`+` 表示1个或多个。

注意split方法可能返回首个token为空的问题，需要剔除。

