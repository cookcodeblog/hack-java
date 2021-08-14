[TOC]

# Output

## Output Format

计算一个整数有多少位？

```java
private static int countDigits(int num) {
        if (num / 100 > 0) {
            return 3;
        } else if (num / 10 > 0) {
            return 2;
        } else {
            return 1;
        }
    }
```

只有在num不超过3位数时才正确。

可以用字符串长度来表示整数的位数：

```java
String.valueOf(num).length();
```

还可以用数学公式来计算。
因为10的0次方是1，10的1次方是10，10的二次方是100，10的三次方是1000。
因此只要对整数求10的对数（即log10），再加上1就可以了。

特殊情况，如果整数是0，则不能求对数，直接返回位数为1。

```java
if (num = 0) 
    return 1;
return (int) (Math.log10(num) + 1);
```

References:
- https://www.baeldung.com/java-number-of-digits-in-int

通用的方法是怎么样的 ？

另外定长的left-just和padding要怎么做才更好？

padding 除了可以用循环来拼接padding字符串外，还可以直接用String.format来做。



```java
// length 为整体长度，包括要pading的部分

// lef padding space
String.format("%1$" + length + "s", inputString);

// left padding zero 
String.format("%1$" + length + "s", inputString).replace(' ', '0');

// right padding space
String.format("%1$-" + length + "s", inputString);
        
// right padding zero
String.format("%1$-" + length + "s", inputString).replace(' ', '0');
```

完整代码示例;

```java

private static String padRightSpace(String str, int len) {
    return String.format("%1$-" + len + "s", str);
}

private static String padLeftZero(int num, int len) {
    return String.format("%1$" + len + "s", num).replace(' ', '0');
}
    
```