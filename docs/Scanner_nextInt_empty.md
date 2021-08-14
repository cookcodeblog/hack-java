

# Scanner

## Java Stdin and Stdout II

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

```java
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

```

输入完成后，应该立即调用`scan.close()`， 不要等到逻辑运行完成后最后才关闭。

References:
- https://stackoverflow.com/questions/45100903/use-of-nextline-method-after-using-nextint-method