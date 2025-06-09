import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mapValue = new HashMap<>();
        mapValue.put('I', 1);
        mapValue.put('V', 5);
        mapValue.put('X', 10);
        mapValue.put('L', 50);
        mapValue.put('C', 100);
        mapValue.put('D', 500);
        mapValue.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = mapValue.get(currentChar);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = mapValue.get(nextChar);

                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }
        return total;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Nhập số la mã: ");
        s = sc.nextLine();
        System.out.println(s);
        int rs = sl.romanToInt(s);
        System.out.println(rs);

    }
}
