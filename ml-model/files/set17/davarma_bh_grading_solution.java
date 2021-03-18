import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

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
