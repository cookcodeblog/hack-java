package cn.xdevops.hack.stdinout;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for(int i = 0;i < n;i ++) {
            numbers[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
