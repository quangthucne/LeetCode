import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;
        }
        return rev == num;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Nhập x = ");
        x = sc.nextInt();
        sc.nextLine();
        boolean rs = sl.isPalindrome(x);
        System.out.println(rs);
    }
}
