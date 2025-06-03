import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Sử dụng hash map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int rs = target - nums[j]; // giá trị cần tìm
            if (map.containsKey(rs) && map.get(rs) != j) { // kiểm tra giá trị có trong map và khác vị trí hiện tại
                                                           // không
                return new int[] { j, map.get(rs) };
            }
        }
        return new int[] {};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n;
        int target;
        int[] rs = { 2 };

        System.out.println("Nhập độ dài mảng: ");
        n = sc.nextInt();
        int[] arrays = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arrays[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Nhập target: ");
        target = sc.nextInt();
        rs = solution.twoSum(arrays, target);
        System.out.println(Arrays.toString(rs));
    }
}