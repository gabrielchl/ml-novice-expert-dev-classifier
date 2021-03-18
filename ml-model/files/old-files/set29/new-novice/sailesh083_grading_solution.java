import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        int result[]=new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i]>=38){
                int a=grades[i]/5;
                int value=5*(a+1)-grades[i];
                if(value<3 && value!=0)
                    result[i]=5*(a+1);
                else
                    result[i]=grades[i];
            }
            else
                result[i]=grades[i];
        }
        return result;
    }

}
