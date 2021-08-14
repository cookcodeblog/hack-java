[TOC]

# 计算字符串中字符出现的次数

```java
private static int[] frequency(String s) {
    int[] freq = new int[26];
    if (s == null || s.isEmpty()) {
        return freq;
    }

    for (int i = 0; i < s.length(); i ++) {
        int ch = s.charAt(i);
        if (ch >= 97 && ch <= 122) {
            // a - z 97 - 122
            // convert to A - Z 65 - 90
            ch = ch - 32;
        }
        freq[ch - 65] += 1;

    }
    return freq;
}

```

用一个26位的int数组来表示26个字符出现的次数，初始值都为0。
将字符转换成ascii码的整数值。
将小写转换成大写。
然后再累加到对应的数组元素中。

另外，比较两个数组，除了可以用循环外。还可以偷懒地用Arrays.toString将数组转换成字符串后再比较。
