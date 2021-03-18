import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        int high = score[0];
        int low = score[0];
        int result[] = new int[2];
        int highcount = 0, lowcount = 0;
        for(int i = 1; i < score.length; i++) {
            if(score[i] > high) {
                highcount++;
                high = score[i];
            } else if(score[i] < low) {
                lowcount++;
                low = score[i];
            }
        }
        result[0] = highcount;
        result[1] = lowcount;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
