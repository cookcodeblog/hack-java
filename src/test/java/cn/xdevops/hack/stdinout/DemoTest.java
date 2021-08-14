package cn.xdevops.hack.stdinout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;


public class DemoTest {

    @Test
    @DisplayName("testDemo")
    void testDemo() throws Exception {

        int[] game = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        int leap = 4;
        System.out.println( (canWin(leap, game)) ? "YES" : "NO" );

    }

    public static boolean canWin(int leap, int[] game) {
        if (game == null || game.length <= 0) {
            return true;
        }

        return move(0, leap, game);
    }

    private static boolean move(int i, int leap, int[] game) {
        if (i < 0 || game[i] == 1) {
            return false;
        }

        if ((i == game.length -1) || (i + leap > game.length - 1)) {
            return true;
        }

        game[i] = 1;

        return move(i - 1, leap, game) || move(i + 1, leap, game) || move(i + leap, leap, game);
    }

    private static int findLargestHourGlass(List<List<Integer>> arr) {
        int maxSum = 0;
        for (int i = 0; i <= 3; i ++) {
            for (int j = 0; j <= 3; j ++) {
                int sum = sumOfHourGlass(arr, i, j);
                if (i == 0 && j == 0) {
                    maxSum = sum;
                }
                 System.out.println(String.format("[%d, %d] = %d", i, j, sum));
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static int sumOfHourGlass(List<List<Integer>> arr, int row, int column) {
        int sum = 0;
        List<Integer> first = arr.get(row);
        List<Integer> mid = arr.get(row + 1);
        List<Integer> last = arr.get(row + 2);
        sum += first.get(column) + first.get(column + 1) + first.get(column + 2);
        sum += mid.get(column + 1);
        sum += last.get(column) + last.get(column + 1) + last.get(column + 2);
        return sum;
    }

    private static boolean isValidUserName(String name) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
        return name.matches(regex);
    }

    private static String[] getTokens(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }
        String[] tokens = s.trim().split("[^a-zA-Z]+"); // or [^A-Za-z]+
        return Stream.of(tokens).filter(str -> !str.isEmpty()).collect(java.util.stream.Collectors.toList()).toArray(tokens);
    }



        private static int[] frequency(String s) {
        int[] freq = new int[26];

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

    private static String getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Calendar month start from zero
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

    private static String getDayOfWeek2(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString().toUpperCase();
    }

}
