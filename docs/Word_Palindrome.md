[TOC]

# Word Palindrome


```java
private static boolean isPalindrome(String s) {
    if (s == null || s.isEmpty()) {
        return false;
    }
    if (s.length() == 1) {
        return true;
    }
    
    for (int i = 0; i < s.length() / 2; i ++) {
        char left = s.charAt(i);
        char right = s.charAt(s.length() - 1 - i);
        if (left != right) {
            return false;
        }
    }
    return true;
}
```

一边从左往右数，一边从右往左数。
一个循环就能数完。
因为同时从左右两边数，半个长度就可以了。

