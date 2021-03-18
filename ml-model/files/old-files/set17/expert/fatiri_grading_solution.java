import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static List<Integer> solve(List<Integer> grades) {
    int n = 3;
    int min = 40;
    int graded = 0;
    int rounded = 0;
     List<Integer> list = new ArrayList();
     for(int g : grades){
         rounded = ((g+4)/5*5);
         if(rounded>=min){
             if(rounded-g<n){
                  list.add(rounded);
             }else {
                 list.add(g);
             }
         }else if(rounded<=min){
             list.add(g);
         }
     }

     return list;

    }
}
