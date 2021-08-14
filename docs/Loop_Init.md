
# Loop Init

```java
private static int findLargestHourGlass(List<List<Integer>> arr) {
    int maxSum = 0;
    for (int i = 0; i <= 3; i ++) {
        for (int j = 0; j <= 3; j ++) {
            int sum = sumOfHourGlass(arr, i, j);
            // System.out.println(String.format("[%d, %d] = %d", i, j, sum));
            if (i == 0 && j == 0) {
                maxSum = sum;
            }
            if (sum > maxSum){
                maxSum=sum;
            }
        } 
    }
    return maxSum;
}
```

一定要给maxSum初始化，不然如果sum都小于0时，maxSum就没有得到初始化，导致逻辑错误。

