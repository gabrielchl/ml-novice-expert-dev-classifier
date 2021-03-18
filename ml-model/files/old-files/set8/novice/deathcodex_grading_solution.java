import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int i=0; i < n; i++){
            grades[i] = in.nextInt();
            if(grades[i]<=37)continue;
            else if(((grades[i]/5)+1)*5-grades[i]<3)grades[i]=((grades[i]/5)+1)*5;
        }
        //int result = solve(grades);
        for (int x:grades)System.out.println(x);
    }
}
