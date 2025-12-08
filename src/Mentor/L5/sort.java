package Mentor.L5;


import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        int [][] nums = new int[2][2];
        nums[0][0] = 5;
        nums[0][1] = 2;
        nums[1][0] = 8;
        nums[1][1] = 7;

        System.out.println("Başlanğıc Massiv:");
        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }

        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }

        System.out.println("Sıralanmış Massiv:");
        for (int i = 0; i < nums.length; i++) {
                System.out.println(Arrays.toString(nums[i]));
            }
        }

    }