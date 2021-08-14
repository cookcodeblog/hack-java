
# Scanner nextInt demo

只需要用nextInt()和循环控制，不需要很和使用nextLine()。

```java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
        int n = scan.nextInt();
        int leap = scan.nextInt();
        
        int[] game = new int[n];
        for (int i = 0; i < n; i++) {
            game[i] = scan.nextInt();
        }

        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
    scan.close();
}
```