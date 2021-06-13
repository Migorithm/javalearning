package com.migorithm.practice.learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Loops2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                nums[i1] += i*i1;
            }
        }

        System.out.println(Arrays.toString(nums));
            }
        }




