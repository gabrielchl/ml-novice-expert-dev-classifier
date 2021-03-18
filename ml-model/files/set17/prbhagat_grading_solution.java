import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> solve(List<Integer> grades) {
    // Write your code here
    int marks = 0;
    int factor = 5;
    int rem = 0;
    int div = 0;
    List<Integer> rnd = new ArrayList<Integer>();
    for (int i=0;i<grades.size();i++){
        marks = grades.get(i);
        if (marks > 37){
        rem = marks % 5;
        div = marks / 5;
        if (rem >= 3) {
            div += 1;
            marks = div * factor;
        }
        }
     //   System.out.println("Rounded marks" +marks);
        rnd.add(marks);
     //   System.out.println("marks"+marks +"div" + div +"rem" +rem);
    }
    return rnd;
    }

}
