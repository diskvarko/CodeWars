package com.codewars;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//
//Note: If the number is a multiple of both 3 and 5, only count it once. Also, if a number is negative, return 0(for languages that do have them)
//
//Courtesy of projecteuler.net

import java.util.ArrayList;
import java.util.List;

    public class Solution {

        public int solution(int number) {
            int sum = 0;
            for (int a = number-1; a > 0; a--){
                if (a%3 == 0 || a%5 ==0 ){
                    sum+=a;
                }
            } return sum;
        }
    }

