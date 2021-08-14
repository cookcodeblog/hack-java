
# Array to String

```java
StringBuilder sb = new StringBuilder();
for (int k = 0; k < values.length; k ++) {
    if (k > 0) {
        sb.append(" ");
    }
    sb.append(values[k]);
}
return sb.toString();
```

或者用Arrays.toString将数组转换成字符串后，再替换掉中括号和逗号。

```java
Arrays.toString(values).replaceAll(",|\\[|\\]", "")
```

当然如果是字符串数组，可以直接用String.join方法：

```bash
String.join(" ", names);
```
