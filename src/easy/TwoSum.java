package easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Enter target:");
        int target = new Scanner(System.in).nextInt();
        output(twoSum(inputArray(), target));
    }

    private static void output(int[] ints) {
        if (ints != null)
            for (int number: ints) {
                System.out.println(number);
            }
        else
            System.out.println("null");
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length < 2)
            return null;
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference))
                return new int[] {map.get(difference), i};
            map.put(nums[i], i);
        }
        return null;
    }

    private static int[] inputArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
            else
                numbers.add(Integer.parseInt(input));
        } while (true);

        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
        return array;
    }
}