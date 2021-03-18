import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++){
            if(grades[i]<38)
                System.out.println(grades[i]);
            else if(grades[i]>=38 && (5-(grades[i]%5)<3)){
                grades[i]=grades[i]+(5-(grades[i]%5));
                System.out.println(grades[i]);
               }
            else
                System.out.println(grades[i]);
            }
        return grades;
       }

}
