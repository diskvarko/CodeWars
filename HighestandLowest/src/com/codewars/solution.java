package com.codewars;
//In this little assignment you are given a string of space separated numbers,
// and have to return the highest and lowest number.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class solution {
    public static String highAndLow(String numbers) {
        String [] arr = numbers.split(" ");
        Integer array [] = new Integer[arr.length];
        int i = 0;
        for(String s: arr){
            array[i] = Integer.parseInt(s);
            i++;
        }
        ArrayList <Integer> arrayLast= new ArrayList<>(Arrays.asList(array));
        int a  = Collections.max(arrayLast);
        int b =  Collections.min(arrayLast);
        String ss = String.valueOf(a) + " " + String.valueOf(b);
        return ss;

    }
}
