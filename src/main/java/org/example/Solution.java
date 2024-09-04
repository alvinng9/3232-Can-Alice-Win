package org.example;

public class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOne = 0;
        int sumTwo = 0;
        int sumTotal = 0;
        //iterate through the given nums array
        for (int num : nums) {
            //count up the sum of all nums
            sumTotal += num;
            //count up the single digit case
            if (num / 10 == 0) {
                sumOne += num;
            }
            //count up the double digit case
            if (num / 10 >= 1 && num / 10 <= 9) {
                sumTwo += num;
            }
        }
        //check if either requirement of the two cases has been met
        return sumOne > sumTotal - sumOne || sumTwo > sumTotal - sumTwo;
    }
}
