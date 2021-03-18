import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
          int n = grades.size();
          List<Integer> result= new ArrayList<>();
          for(int i=0;i<n;i++){
           if(grades.get(i) < 38)
           result.add(grades.get(i));
           else{
               if((grades.get(i) + 1)% 5 == 0 || (grades.get(i) + 2)% 5 == 0 ){
                   int temp = (grades.get(i)+1)%5 == 0 ? grades.get(i)+1 : grades.get(i)+2;
                   result.add(temp);
               }

               else
               result.add(grades.get(i));
           }
          }
          return result;

    }

}
