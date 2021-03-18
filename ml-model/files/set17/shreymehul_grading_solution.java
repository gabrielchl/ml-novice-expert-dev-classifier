import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        for(int i=0;i< grades.length-1;i++){
            if(grades[i]<38){

            }
            else if(grades[i]%5 > 2){
                grades[i]= grades[i] + (5-grades[i]%5);
            }
        }
        return grades;
    }

}
