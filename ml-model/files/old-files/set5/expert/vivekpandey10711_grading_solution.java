import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
          List<Integer> fgrades = new ArrayList();
         int f =5;
         for(int i = 0;i<grades.size();i++){
             int gvalue = grades.get(i);
         if(gvalue>=38){
             if(gvalue%5!=0){
             int a = gvalue%5;
            int v = f-a;
             if(v<3){
             gvalue = gvalue+v;
            fgrades.add(i,gvalue);
             }else{
               fgrades.add(i,gvalue);
             }
             } else{
                 fgrades.add(i,gvalue);
             }
         }else{
             fgrades.add(i, gvalue);
         }
         }
         return fgrades;
    }

}
