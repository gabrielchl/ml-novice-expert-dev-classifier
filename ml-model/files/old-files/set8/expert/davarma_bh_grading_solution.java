import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] grades = new int[n];
        for(int i=0;i<n;i++){
            grades[i] = input.nextInt();
        }
        int[] result = solve(grades);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + (i != result.length-1 ? "\n":" "));
        }
        System.out.print(" ");
    }

    static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=38){
                int nextMulFive = 5 - (grades[i] % 5) + grades[i];
                if((nextMulFive - grades[i]) < 3){
                    grades[i] = nextMulFive;
                }
            }
        }
        return grades;
    }
}
